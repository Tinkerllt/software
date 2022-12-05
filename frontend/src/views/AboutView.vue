<template>
  <div>
    <el-form :model="loginForm" :rules="rules" class="login_container" label-position="left" label-width="0px"
      v-loading="loading">
      <h3 class="login_title">Welcome</h3>
      <el-form-item prop="userName">
        <el-input type="text" v-model="loginForm.userName" auto-complete="off" placeholder="username"></el-input>
      </el-form-item>
      <el-form-item prop="passWord">
        <el-input type="password" v-model="loginForm.passWord" auto-complete="off" placeholder="password"></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="register">register
        </el-button>
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="login">login
        </el-button>
      </el-form-item>
    </el-form>

    <div>{{ msg }}</div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "AboutView",
  data() {
    return {
      loginForm: {
        userName: "",
        passWord: "",
      },
      rules: {
        userName: [{ required: true, message: "Please input user name", trigger: "blur" }],
        passWord: [{ required: true, message: "Please input password", trigger: "blur" }],
      },
      loading: false,
      msg: "",
    };
  },
  methods: {
    register() {
      axios.post("/api/v1/user/register", {
        name: this.loginForm.userName,
        password: this.loginForm.passWord,
      })
        .then((resp) => {
          if (resp.status === 200) {
            window.location.href = "/check"
            alert('register success')
          } else {
            console.log(resp.status);
            alert('register failed')
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error");
        });
    },
    login() {
      axios.get('/api/v1/user/login', {
        params: {
          name: this.loginForm.userName,
          password: this.loginForm.passWord
        }
      }).then((resp) => {
          if (resp.status === 200) {
            if (resp.data == "1") {
              alert('login success as administrator')
              window.location.href = "/maintain";
            } else if(resp.data == "0") {
              alert('login success as user')
              window.location.href = "/check";
            } else {
              alert('login failed');
            }
          } else {
            console.log(resp.status);
            alert("error");
          }
        });
    },
  },
};
</script>

<style scoped>
#base_login {
  background: url("../assets/checkerboard-cross.png") repeat;
  background-position: center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}

body {
  margin: 0px;
  padding: 0px;
}

.login_container {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 90px auto;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}

.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #494e8f;
}
</style>
