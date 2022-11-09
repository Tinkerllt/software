<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HomePage msg="Welcome to movie information system." />
  </div>
</template>

<script>
// @ is an alias to /src
import HomePage from '@/components/HomePage.vue'

export default {
  name: 'HomeView',
  components: {
    HomePage
  }
}
</script>
