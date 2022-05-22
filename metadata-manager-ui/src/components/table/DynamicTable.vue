<template>
  <a-table :data-source="dataSource" :columns="columns" />
</template>

<script>
export default {
  name: "DynamicTable",
  setup() {
    return {
      dataSource: [],
      columns: [],
    }
  }
};
</script>

<style scoped>

</style>