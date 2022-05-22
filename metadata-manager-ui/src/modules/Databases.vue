
<template>

  <a-button @click="showDatabases" >显示数据清单</a-button>

  <DynamicTable v-show="show.listDatabases" :dataSource="data" :columns="columns"></DynamicTable>

</template>

<script setup>
import { ref } from 'vue';
import IO from 'axios'
import Catalog from '../api/catalog.js'
import DynamicTable from "../components/table/DynamicTable.vue";

const data = ref([]);
const columns = ref([
  {
    title: 'ID', dataIndex: 'id', key: 'id',
  },
  {
    title: '数据库名称', dataIndex: 'name', key: 'name',
  },
  {
    title: '备注', dataIndex: 'comment', key: 'comment',
  },
  {
    title: '拥有者', dataIndex: 'owner', key: 'owner',
  }
]);

const show = {
  "listDatabases": false
};
const showDatabases = function() {
  Catalog.listDatabase().then(res => {
    console.log(res);
    console.log(res.data.content);
    data.value = res.data.content;
    show.listDatabases = true;
  }).catch(ex => {
    console.log(ex);
  })
};
</script>

<style scoped>

</style>