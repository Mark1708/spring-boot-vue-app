<template>
  <div id="app">
    <nav class="navbar navbar-expand navbar-dark bg-dark">
      <a href="https://github.com/Mark1708" class="navbar-brand h3">Mark1708</a>
      <div class="navbar-nav mr-auto">
        <li class="nav-item">
          <router-link to="/tutorials" class="nav-link h6"
            >Tutorials</router-link
          >
        </li>
        <li class="nav-item">
          <router-link to="/add" class="nav-link h6">Add</router-link>
        </li>
      </div>
    </nav>

    <div class="container mt-5">
      <router-view />
    </div>
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>
