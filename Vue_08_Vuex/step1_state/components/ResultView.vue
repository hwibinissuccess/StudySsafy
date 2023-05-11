<template>
  <div>
    <h2>전체 {{total}} 번 클릭됨</h2>
  </div>
</template>

<script>
export default {
    name: "ResultView",
    computed: {
      total() {
        return this.$store.state.total
      }
    }
}
</script>

<style>

</style>