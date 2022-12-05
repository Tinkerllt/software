<template>
  <div style="position: relative;">
    <el-button type="primary" style="width: 8%; background: #afb4db; border: none" v-on:click="checkCinema">查询影院信息
    </el-button> |
    <select v-model='city' name="area">
      <option disabled>城市</option>
      <option value="杭州">杭州</option>
      <option value="内蒙古">内蒙古</option>
      <option value="成都">成都</option>
    </select>
  </div> ---------------------------------------
  <el-table :data="this.all_cinema_data" style="width: 100%">
    <el-table-column prop="cinemaId" label="id">
    </el-table-column>
    <el-table-column prop="cinemaName" label="name">
    </el-table-column>
    <el-table-column prop="enableOrNot" label="status">
    </el-table-column>
    <el-table-column prop="cinemaAddress" label="address">
    </el-table-column>
    <el-table-column prop="cinemaLocationOfCity" label="location">
    </el-table-column>
  </el-table>
  <div style="position: relative;">
    <el-button type="primary" style="width: 8%; background: #afb4db; border: none" v-on:click="checkMovie" round>
      查询电影信息
    </el-button>
  </div>
  <el-table :data="this.all_movie_data" style="width: 100%">
    <el-table-column prop="movieId" label="id">
    </el-table-column>
    <el-table-column prop="movieName" label="name">
    </el-table-column>
    <el-table-column prop="movieDuration" label="duration">
    </el-table-column>
    <el-table-column prop="releaseDate" label="release date">
    </el-table-column>
    <el-table-column prop="endDate" label="end date">
    </el-table-column>
    <el-table-column prop="hiddenOrNot" label="status">
    </el-table-column>
    <el-table-column prop="movieInfo" label="information">
    </el-table-column>
  </el-table>
  <div>
    <select v-model="this.cinema_data.cinemaId" placeholder="cinemaId">
      <option v-for="item in this.all_cinema_data" :key="item.cinemaId" :label="item.cinemaName" :value="item.cinemaId">
      </option>
    </select>
    <el-button type="primary" style="width: 8%; background: #afb4db; border: none" v-on:click="getCinema">查看影院信息
    </el-button>
    <el-descriptions title="cinema information" direction="vertical">
      <el-descriptions-item label="id"> {{ this.cinema_data.cinemaId }} </el-descriptions-item>
      <el-descriptions-item label="name"> {{ this.cinema_data.cinemaName }} </el-descriptions-item>
      <el-descriptions-item label="status"> {{ this.cinema_data.enableOrNot }} </el-descriptions-item>
      <el-descriptions-item label="address"> {{ this.cinema_data.cinemaAddress }} </el-descriptions-item>
      <el-descriptions-item label="location"> {{ this.cinema_data.cinemaLocationOfCity }} </el-descriptions-item>
    </el-descriptions>
  </div>
  <div>
    <select v-model="this.movie_data.movieId" placeholder="movieId">
      <option v-for="item in this.all_movie_data" :key="item.movieId" :label="item.movieName" :value="item.movieId">
      </option>
    </select>
    <el-button type="primary" style="width: 8%; background: #afb4db; border: none" v-on:click="getMovie">查看电影信息
    </el-button>
    <el-descriptions title="cinema information" direction="vertical">
      <el-descriptions-item label="id"> {{ this.movie_data.movieId }} </el-descriptions-item>
      <el-descriptions-item label="name"> {{ this.movie_data.movieName }} </el-descriptions-item>
      <el-descriptions-item label="duration"> {{ this.movie_data.movieDuration }} </el-descriptions-item>
      <el-descriptions-item label="release date"> {{ this.movie_data.releaseDate }} </el-descriptions-item>
      <el-descriptions-item label="end date"> {{ this.movie_data.endDate }} </el-descriptions-item>
      <el-descriptions-item label="status"> {{ this.movie_data.hiddenOrNot }} </el-descriptions-item>
      <el-descriptions-item label="information"> {{ this.movie_data.movieInfo }} </el-descriptions-item>
    </el-descriptions>
  </div>
  <div>
    <el-form :model="loginForm" :rules="rules" class="login_container" label-position="left" label-width="0px"
      v-loading="loading">
      <h3 class="login_title">电影院信息编辑</h3>
      <el-form-item prop="cinemaId">
        <el-input type="number" v-model="cinema_data.cinemaId" auto-complete="off"
          placeholder="cinema id(not necessary)"></el-input>
      </el-form-item>
      <el-form-item prop="cinemaName">
        <el-input type="text" v-model="cinema_data.cinemaName" auto-complete="off" placeholder="cinema name"></el-input>
      </el-form-item>
      <div>enable or not: </div>
      <el-form-item prop="enableOrNot">
        <select v-model="cinema_data.enableOrNot" auto-complete="off" placeholder="enable or not">
          <option label="true" :value="true"></option>
          <option label="false" :value="false"></option>
        </select>
      </el-form-item>
      <el-form-item prop="cinemaAddress">
        <el-input type="text" v-model="cinema_data.cinemaAddress" auto-complete="off" placeholder="cinema address">
        </el-input>
      </el-form-item>
      <el-form-item prop="cinemaLocationOfCity">
        <el-input type="text" v-model="cinema_data.cinemaLocationOfCity" auto-complete="off"
          placeholder="cinema location of city"></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="udCinemaInfo">修改影院信息
        </el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="insCinema">增加新电影院
        </el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="delCinema">删除电影院
        </el-button>
      </el-form-item>
    </el-form>
  </div>
  <div>
    <el-form :model="loginForm" :rules="rules" class="login_container" label-position="left" label-width="0px"
      v-loading="loading">
      <h3 class="login_title">电影信息编辑</h3>
      <el-form-item prop="movieId">
        <el-input type="text" v-model="movie_data.movieId" auto-complete="off" placeholder="movie id(not necessary)">
        </el-input>
      </el-form-item>
      <el-form-item prop="movieName">
        <el-input type="text" v-model="movie_data.movieName" auto-complete="off" placeholder="movie name"></el-input>
      </el-form-item>
      <el-form-item prop="movieDuration">
        <el-input type="text" v-model="movie_data.movieDuration" auto-complete="off" placeholder="movie duration">
        </el-input>
      </el-form-item>
      <el-form-item prop="releaseDate">
        <el-input type="text" v-model="movie_data.releaseDate" auto-complete="off" placeholder="release date">
        </el-input>
      </el-form-item>
      <el-form-item prop="endDate">
        <el-input type="text" v-model="movie_data.endDate" auto-complete="off" placeholder="end date"></el-input>
      </el-form-item>
      <div>hidden or not: </div>
      <el-form-item prop="hiddenOrNot">
        <select v-model="movie_data.hiddenOrNot" auto-complete="off" placeholder="hidden or not">
          <option label="true" :value="true"></option>
          <option label="false" :value="false"></option>
        </select>
      </el-form-item>
      <el-form-item prop="movieInfo">
        <el-input type="text" v-model="movie_data.movieInfo" auto-complete="off" placeholder="movie info"></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="udMovieInfo">修改电影信息
        </el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="insMovie">增加新电影
        </el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="hidMovie">取消电影
        </el-button>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button type="primary" style="width: 30%; background: #afb4db; border: none" v-on:click="delMovie">删除电影
        </el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
  
<script>
import axios from 'axios';

export default {
  name: 'AdminView',
  data() {
    return {
      all_cinema_data: null,
      all_cinema_id: new Array(),
      all_movie_data: null,
      all_movie_id: new Array(),
      cinema_data: {
        cinemaId: -1,
        cinemaName: null,
        enableOrNot: false,
        cinemaAddress: null,
        cinemaLocationOfCity: null
      },
      movie_data: {
        movieId: null,
        movieName: null,
        movieDuration: null,
        releaseDate: null,
        endDate: null,
        hiddenOrNot: false,
        movieInfo: null
      },
      city: "杭州",
      rules: {
        cinemaId: [{ required: false, trigger: "blur" }],
        cinemaName: [{ required: true, message: "Please input new cinema name", trigger: "blur" }],
        enableOrNot: [{ required: true, message: "enable or not ? ", trigger: "blur" }],
        cinemaAddress: [{ required: true, message: "Please input new cinema address", trigger: "blur" }],
        cinemaLocationOfCity: [{ required: true, message: "Please input cinema location of city", trigger: "blur" }],
        movieId: [{ required: false, trigger: "blur" }],
        movieName: [{ required: true, message: "Please input new Movie name", trigger: "blur" }],
        movieDuration: [{ required: true, message: "Please input new movie duration", trigger: "blur" }],
        releaseDate: [{ required: true, message: "Please input new release date", trigger: "blur" }],
        endDate: [{ required: true, message: "Please input new end date", trigger: "blur" }],
        hiddenOrNot: [{ required: true, message: "Please input hidden or not", trigger: "blur" }],
        movieInfo: [{ required: true, message: "Please input movie info", trigger: "blur" }],
      }
    }
  },
  methods: {
    clearCinema() {
      this.cinema_data.cinemaId = -1;
      this.cinema_data.cinemaName = null;
      this.cinema_data.enableOrNot = false;
      this.cinema_data.cinemaAddress = null;
      this.cinema_data.cinemaLocationOfCity = null;
    },
    clearMovie() {
      this.movie_data.movieId = null;
      this.movie_data.movieName = null;
      this.movie_data.movieDuration = null;
      this.movie_data.releaseDate = null;
      this.movie_data.endDate = null;
      this.movie_data.hiddenOrNot = false;
      this.movie_data.movieInfo = null;
    },
    checkCinema() {
      axios.get("/api/v1/tavel/cinema/" + this.city)
        .then((resp) => {
          if (resp.status === 200) {
            this.all_cinema_data = resp.data;
            for (var i = 0, l = resp.data.length; i < l; i++) {
              this.all_cinema_id.push(resp.data['cinemaId']);
            }
          } else {
            console.log(resp.status);
            alert("error");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error");
        });
    },
    checkMovie() {
      axios.get("/api/v1/tavel/movie")
        .then((resp) => {
          if (resp.status === 200) {
            this.all_movie_data = resp.data;
            for (var i = 0, l = resp.data.length; i < l; i++) {
              this.all_movie_id.push(resp.data['movieId']);
            }
          } else {
            console.log(resp.status);
            alert("error");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("error");
        });
    },
    getCinema() {
      for (var i = 0, l = this.all_cinema_data.length; i < l; i++) {
        if (this.all_cinema_data[i].cinemaId == this.cinema_data.cinemaId) {
          this.cinema_data.cinemaName = this.all_cinema_data[i].cinemaName;
          this.cinema_data.enableOrNot = this.all_cinema_data[i].enableOrNot;
          this.cinema_data.cinemaAddress = this.all_cinema_data[i].cinemaAddress;
          this.cinema_data.cinemaLocationOfCity = this.all_cinema_data[i].cinemaLocationOfCity;
          break;
        }
      }
    },
    insCinema() {
      axios.post('api/v1/admin/insCinema', {
        cinemaName: this.cinema_data.cinemaName,
        enableOrNot: this.cinema_data.enableOrNot,
        cinemaAddress: this.cinema_data.cinemaAddress,
        cinemaLocationOfCity: this.cinema_data.cinemaLocationOfCity
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    udCinemaInfo() {
      axios.put('api/v1/admin/udCinemaInfo', {
        cinemaId: this.cinema_data.cinemaId,
        cinemaName: this.cinema_data.cinemaName,
        enableOrNot: this.cinema_data.enableOrNot,
        cinemaAddress: this.cinema_data.cinemaAddress,
        cinemaLocationOfCity: this.cinema_data.cinemaLocationOfCity
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    delCinema() {
      axios.delete('/api/v1/admin/delCinema', {
        params: {
          cinemaId: this.cinema_data.cinemaId
        }
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    getMovie() {
      for (var i = 0, l = this.all_movie_data.length; i < l; i++) {
        if (this.all_movie_data[i].movieId == this.movie_data.movieId) {
          this.movie_data.movieName = this.all_movie_data[i].movieName;
          this.movie_data.movieDuration = this.all_movie_data[i].movieDuration;
          this.movie_data.releaseDate = this.all_movie_data[i].releaseDate;
          this.movie_data.endDate = this.all_movie_data[i].endDate;
          this.movie_data.hiddenOrNot = this.all_movie_data[i].hiddenOrNot;
          this.movie_data.movieInfo = this.all_movie_data[i].movieInfo;
          break;
        }
      }
    },
    insMovie() {
      axios.post('/api/v1/admin/insMovie', {
        movieName: this.movie_data.movieName,
        movieDuration: this.movie_data.movieDuration,
        releaseDate: this.movie_data.releaseDate,
        endDate: this.movie_data.endDate,
        hiddenOrNot: this.movie_data.hiddenOrNot,
        movieInfo: this.movie_data.movieInfo
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    udMovieInfo() {
      axios.put('/api/v1/admin/udMovieInfo', {
        movieId: this.movie_data.movieId,
        movieName: this.movie_data.movieName,
        movieDuration: this.movie_data.movieDuration,
        releaseDate: this.movie_data.releaseDate,
        endDate: this.movie_data.endDate,
        hiddenOrNot: this.movie_data.hiddenOrNot,
        movieInfo: this.movie_data.movieInfo
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    hidMovie() {
      axios.put('/api/v1/admin/udMovieInfo', {
        movieId: this.movie_data.movieId
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    delMovie() {
      axios.delete('api/v1/admin/delMovie', {
        params: {
          movieId: this.movie_data.movieId
        }
      }).then((resp) => {
        if (resp.status === 200) {
          alert(resp.data)
        } else {
          console.log(resp.status);
          alert("error");
        }
      }).catch((error) => {
        console.log(error);
        alert("error");
      });
    },
    putMovie() {
      axios.put('api/v1/admin/putMovie', {
        movieId: null,
        cinemaId: null,
        screeningDate: null,
        startTime: null,
        hallName: null
      })
        .then((resp) => {
          if (resp.status === 200) {
            this.msg = resp.data;
          } else {
            console.log(resp.status);
            alert("error");
          }
        }).catch((error) => {
          console.log(error);
          alert("error");
        });
    }
  }
}
</script>
  
<style>
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