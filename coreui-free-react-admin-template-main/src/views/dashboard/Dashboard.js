import React from 'react'
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  BarElement,
  Title,
  Tooltip,
  Legend,
} from 'chart.js'
import { Bar } from 'react-chartjs-2'
import {
  CAvatar,
  CButton,
  CButtonGroup,
  CCard,
  CCardBody,
  CCardFooter,
  CCardHeader,
  CCol,
  CProgress,
  CRow,
  CTable,
  CTableBody,
  CTableDataCell,
  CTableHead,
  CTableHeaderCell,
  CTableRow,
} from '@coreui/react'
import { CChart, CChartDoughnut, CChartLine } from '@coreui/react-chartjs'
import { getStyle, hexToRgba } from '@coreui/utils'
import CIcon from '@coreui/icons-react'
import {
  cibCcAmex,
  cibCcApplePay,
  cibCcMastercard,
  cibCcPaypal,
  cibCcStripe,
  cibCcVisa,
  cibGoogle,
  cibFacebook,
  cibLinkedin,
  cifBr,
  cifEs,
  cifFr,
  cifIn,
  cifPl,
  cifUs,
  cibTwitter,
  cilCloudDownload,
  cilPeople,
  cilUser,
  cilUserFemale,
} from '@coreui/icons'

import avatar1 from 'src/assets/images/avatars/1.jpg'
import avatar2 from 'src/assets/images/avatars/2.jpg'
import avatar3 from 'src/assets/images/avatars/3.jpg'
import avatar4 from 'src/assets/images/avatars/4.jpg'
import avatar5 from 'src/assets/images/avatars/5.jpg'
import avatar6 from 'src/assets/images/avatars/6.jpg'

import WidgetsBrand from '../widgets/WidgetsBrand'
import WidgetsDropdown from '../widgets/WidgetsDropdown'
import { AgChartsReact } from 'ag-charts-react'

const Dashboard = () => {
  const random = (min, max) => Math.floor(Math.random() * (max - min + 1) + min)

  const progressExample = [
    { title: 'Visits', value: '29.703 Total Carbon FootPrint', percent: 40, color: 'success' },
    { title: 'Unique', value: '24.093 Users', percent: 20, color: 'info' },
    { title: 'Pageviews', value: '78.706 Views', percent: 60, color: 'warning' },
    { title: 'New Users', value: '22.123 Users', percent: 80, color: 'danger' },
    { title: 'Bounce Rate', value: 'Average Rate', percent: 40.15, color: 'primary' },
  ]

  const progressGroupExample1 = [
    { title: 'Monday', value1: 34, value2: 78 },
    { title: 'Tuesday', value1: 56, value2: 94 },
    { title: 'Wednesday', value1: 12, value2: 67 },
    { title: 'Thursday', value1: 43, value2: 91 },
    { title: 'Friday', value1: 22, value2: 73 },
    { title: 'Saturday', value1: 53, value2: 82 },
    { title: 'Sunday', value1: 9, value2: 69 },
  ]

  const progressGroupExample2 = [
    { title: 'Male', icon: cilUser, value: 53 },
    { title: 'Female', icon: cilUserFemale, value: 43 },
  ]

  const progressGroupExample3 = [
    { title: 'Organic Search', icon: cibGoogle, percent: 56, value: '191,235' },
    { title: 'Facebook', icon: cibFacebook, percent: 15, value: '51,223' },
    { title: 'Twitter', icon: cibTwitter, percent: 11, value: '37,564' },
    { title: 'LinkedIn', icon: cibLinkedin, percent: 8, value: '27,319' },
  ]

  const tableExample = [
    {
      avatar: { src: avatar1, status: 'success' },
      user: {
        name: 'Airlines',
      },
      country: { name: '05-03-2018' },
      usage: {
        value: '  559',
        period: 'Jun 11, 2021 - Jul 10, 2021',
        color: 'success',
      },
      payment: { name: 'GBP', icon: cibCcMastercard },
      activity: '924 kg',
    },
    {
      avatar: { src: avatar1, status: 'danger' },
      user: {
        name: 'Airlines',
        new: false,
        registered: 'Jan 1, 2021',
      },
      country: { name: '25-03-2018' },
      usage: {
        value: '  671',
        period: 'Jun 11, 2021 - Jul 10, 2021',
        color: 'info',
      },
      payment: { name: 'NZD', icon: cibCcVisa },
      activity: '575 kg',
    },
    {
      avatar: { src: avatar1, status: 'warning' },
      user: { name: 'Airlines', new: true, registered: 'Jan 1, 2021' },
      country: { name: '25-02-2018', flag: cifIn },
      usage: {
        value: '  446',
        period: 'Jun 11, 2021 - Jul 10, 2021',
        color: 'warning',
      },
      payment: { name: 'USD', icon: cibCcStripe },
      activity: '533 kg',
    },
    {
      avatar: { src: avatar4, status: 'secondary' },
      user: { name: 'Misc. Stores', new: true, registered: 'Jan 1, 2021' },
      country: { name: '01-02-2018', flag: cifFr },
      usage: {
        value: '  907',
        period: 'Jun 11, 2021 - Jul 10, 2021',
        color: 'danger',
      },
      payment: { name: 'EUR', icon: cibCcPaypal },
      activity: '425 kg',
    },
    {
      avatar: { src: avatar5, status: 'success' },
      user: {
        name: 'Business Services',
        new: true,
        registered: 'Jan 1, 2021',
      },
      country: { name: '18-02-2018', flag: cifEs },
      usage: {
        value: '  864',
        period: 'Jun 11, 2021 - Jul 10, 2021',
        color: 'primary',
      },
      payment: { name: 'GBP', icon: cibCcApplePay },
      activity: '247 kg',
    },
    {
      avatar: { src: avatar1, status: 'danger' },
      user: {
        name: 'Airlines',
        new: true,
        registered: 'Jan 1, 2021',
      },
      country: { name: '25-02-2018', flag: cifPl },
      usage: {
        value: '  667',
        period: 'Jun 11, 2021 - Jul 10, 2021',
        color: 'success',
      },
      payment: { name: 'PLN', icon: cibCcAmex },
      activity: '207 kg',
    },
  ]
  ChartJS.register(CategoryScale, LinearScale, BarElement, Title, Tooltip, Legend)

  const options = {
    plugins: {
      title: {
        display: true,
        text: 'Top 5 Category Avg. vs You',
      },
    },
    responsive: true,
    scales: {
      x: {
        stacked: true,
      },
      y: {
        stacked: true,
      },
    },
  }

  const labels = [
    'Retail Services',
    'Lodging',
    'Misc. Stores',
    'Agricultural Services',
    'Clothing Stores',
  ]

  const data = {
    labels,
    datasets: [
      {
        label: ' Category Average',
        data: [155, 337, 222, 33, 8],
        backgroundColor: 'rgb(255, 99, 132)',
      },
      {
        label: 'Your Consumption',
        data: [1182, 1280, 636, 265, 159],
        backgroundColor: 'rgb(75, 192, 192)',
      },
    ],
  }

  const [doughnut] = React.useState({
    labels: ['Red', 'Green', 'Yellow'],
    datasets: [
      {
        data: [300, 50, 100],
        backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56'],
        hoverBackgroundColor: ['#FF6384', '#36A2EB', '#FFCE56'],
      },
    ],
  })

  return (
    <>
      <WidgetsDropdown />

      <AgChartsReact
        options={{
          data: [
            { os: 'Agriculture', share: 4.5 },
            { os: 'Airlines', share: 37 },
            { os: 'Business Services', share: 0.5 },
            { os: 'Car Rental', share: 1 },
            { os: 'Clothing Store', share: 2.6 },
            { os: 'Contracted Services', share: 0.3 },
            { os: 'Government Services', share: 0 },
            { os: 'Lodging', share: 22 },
            { os: 'Misc. Services', share: 10.7 },
            { os: 'Membership', share: 1.0 },
            { os: 'Retail Outlet Services', share: 19.1 },
            { os: 'Transportation Services', share: 0.0 },
            { os: 'Utility Services', share: 0.0 },
          ],
          title: {
            text: 'Carbon Footprint',
          },
          subtitle: {
            text: 'per category',
          },
          series: [
            {
              type: 'pie',
              labelKey: 'os',
              angleKey: 'share',
              innerRadiusOffset: -60,
            },
          ],
        }}
      />
      <CCard className="mb-4 mt-4">
        <CCardBody>
          <CRow>
            <CCol sm={5}>
              <h4 id="traffic" className="card-title mb-0">
                Carbon Footprint Trend
              </h4>
              <div className="small text-medium-emphasis">February - March 2018</div>
            </CCol>
            <CCol sm={7} className="d-none d-md-block">
              <CButton color="primary" className="float-end">
                <CIcon icon={cilCloudDownload} />
              </CButton>
              <CButtonGroup className="float-end me-3">
                {['Week', 'Month', 'Year'].map((value) => (
                  <CButton
                    color="outline-secondary"
                    key={value}
                    className="mx-0"
                    active={value === 'Month'}
                  >
                    {value}
                  </CButton>
                ))}
              </CButtonGroup>
            </CCol>
          </CRow>
        </CCardBody>
      </CCard>
      <CCard className="mb-4" style={{ width: '85', height: '13' }}>
        <CCardBody>
          <Bar options={options} data={data} />
        </CCardBody>
      </CCard>

      <CRow>
        <CCol xs>
          <CCard className="mb-4">
            <CCardHeader>
              <span>
                Top Credit Card Transactions by CO<sub>2</sub> Emission
              </span>
            </CCardHeader>
            <CCardBody>
              <CTable striped align="middle" className="mb-0 border" hover responsive>
                <CTableHead color="dark">
                  <CTableRow>
                    <CTableHeaderCell className="text-center">
                      <CIcon icon={cilPeople} />
                    </CTableHeaderCell>
                    <CTableHeaderCell>Category</CTableHeaderCell>
                    <CTableHeaderCell className="text-center">Transaction Date</CTableHeaderCell>
                    <CTableHeaderCell>Transaction Amount</CTableHeaderCell>
                    <CTableHeaderCell className="text-center">Currency</CTableHeaderCell>
                    <CTableHeaderCell>Carbon Emission</CTableHeaderCell>
                  </CTableRow>
                </CTableHead>
                <CTableBody>
                  {tableExample.map((item, index) => (
                    <CTableRow v-for="item in tableItems" key={index}>
                      <CTableDataCell className="text-center">
                        <CAvatar size="md" src={item.avatar.src} status={item.avatar.status} />
                      </CTableDataCell>
                      <CTableDataCell>
                        <div>{item.user.name}</div>
                      </CTableDataCell>
                      <CTableDataCell className="text-center">
                        <span>{item.country.name}</span>
                      </CTableDataCell>
                      <CTableDataCell>
                        <div className="clearfix">
                          <div className="float-start">{item.usage.value}</div>
                        </div>
                      </CTableDataCell>
                      <CTableDataCell className="text-center">{item.payment.name}</CTableDataCell>
                      <CTableDataCell>
                        <div className="clearfix">
                          <div className="float-start">{item.activity}</div>
                        </div>
                      </CTableDataCell>
                    </CTableRow>
                  ))}
                </CTableBody>
              </CTable>
            </CCardBody>
          </CCard>
        </CCol>
      </CRow>
    </>
  )
}

export default Dashboard
