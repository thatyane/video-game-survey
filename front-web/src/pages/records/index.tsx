import React, { useEffect, useState } from 'react';
import './styles.css';
import axios from 'axios';
import { RecordsResponse } from './types';
import { formatDate } from './helpers';
import Pagination from './pagination';
import Filters from '../../components/filters/header';

const BASE_URL = 'https://video-game-survey.herokuapp.com';

const Records = () => {
  const [recordsResponse, setRecordsResponse] = useState<RecordsResponse>();
  const [activePage, setActivePage] = useState(0);

  const handlePageChange = (index: number) => {
    setActivePage(index);
  };

  useEffect(() => {
    axios
      .get(`${BASE_URL}/records?size=12&page=${activePage}`)
      .then((response) => setRecordsResponse(response.data));
  }, [activePage]);

  return (
    <div className="page-container">
      <Filters link="/charts" linkText="VER GRÁFICOS" />
      <table className="records-table" cellPadding="0" cellSpacing="0">
        <thead>
          <tr>
            <th>DATA</th>
            <th>NOME</th>
            <th>IDADE</th>
            <th>PLATAFORMA</th>
            <th>GÊNERO</th>
            <th>TÍTULO GAME</th>
          </tr>
        </thead>
        <tbody>
          {recordsResponse?.content.map((record) => (
            <tr key={record.id}>
              <td>{formatDate(record.moment)}</td>
              <td>{record.name}</td>
              <td>{record.age}</td>
              <td className="text-secondary">{record.gamePlatform}</td>
              <td>{record.genreName}</td>
              <td className="text-primary">{record.gameTitle}</td>
            </tr>
          ))}
        </tbody>
      </table>
      <Pagination
        activePage={activePage}
        totalPages={recordsResponse?.totalPages}
        goToPage={handlePageChange}
      />
    </div>
  );
};

export default Records;
