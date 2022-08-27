import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    path: "/",
    alias: "/tutorials",
    name: "tutorials",
    component: () => import("../views/TutorialsListView"),
  },
  {
    path: "/tutorials/:id",
    name: "tutorial-details",
    component: () => import("../views/TutorialView"),
  },
  {
    path: "/add",
    name: "add",
    component: () => import("../views/AddTutorialView"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
