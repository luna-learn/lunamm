import api from './api.js'

const Catalog = {
  listDatabase: () => {
    return api.get('/catalog/database/list', {});
  },
  listTables: () => {
    return api.get('/catalog/table/list', {});
  }
};

export default Catalog;