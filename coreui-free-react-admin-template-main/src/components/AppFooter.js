import React from 'react'
import { CFooter } from '@coreui/react'

const AppFooter = () => {
  return (
    <CFooter>
      <div>
        <span className="ms-1">&copy; Societe Generale 2022</span>
      </div>
      <div className="ms-auto">
        <span className="me-1">Powered by</span>
        <h5>Hackerverse 2022</h5>
      </div>
    </CFooter>
  )
}

export default React.memo(AppFooter)
