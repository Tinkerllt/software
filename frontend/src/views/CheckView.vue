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
</template>

<script>
import axios from 'axios';

export default {
  name: 'CheckView',
  data() {
    return {
      city: "杭州",
      all_cinema_data: null,
      all_movie_data: null,
    }
  },
  methods: {
    checkCinema() {
      axios.get("/api/v1/tavel/cinema/" + this.city)
        .then((resp) => {
          if (resp.status === 200) {
            this.all_cinema_data = resp.data;
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
  }
}
</script>

<style>

</style>