<template>
  <div>
    <button @click="addCount">{{ title }} - {{ count }}</button>
  </div>
</template>

<script>
export default {
  name: "SubjectView",
  props: {
    title: String,
  },
  data() {
    return {
      count: 0,
    };
  },
  methods: {
    addCount() {
      this.count += 1;
      this.$emit('add-to-count')
    },
  },
};
</script>

<style>
</style>