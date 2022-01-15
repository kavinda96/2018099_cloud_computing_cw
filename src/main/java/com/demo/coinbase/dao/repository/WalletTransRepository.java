/**
 * PROJECT : ${Wallet}
 * PRODUCT : ${com.demo.wallet}
 * **************************************************************
 * Copyright(C) 2018 Fortunaglobal (PRIVATE) LIMITED
 * All rights reserved.
 * **************************************************************
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF
 * Fortunaglobal(PRIVATE) LIMITED.
 * **************************************************************
 * This copy of the Source Code is intended for Fortunaglobal (PRIVATE) LIMITED 's internal use only
 * and is
 * intended for view by persons duly authorized by the management of Fortunaglobal (PRIVATE)
 * LIMITED. No
 * part of this file may be reproduced or distributed in any form or by any
 * means without the written approval of the Management of Fortunaglobal (PRIVATE) LIMITED.
 * **************************************************************
 * **************************************************************
 * Author : P.K.M Madusha
 * Date : ${2018/08} 10:20 AM
 * Since : version 1.0
 * Description :
 * ***************
 **/
package com.demo.coinbase.dao.repository;

import com.demo.coinbase.dao.model.WalletTrans;
import org.springframework.data.repository.CrudRepository;

/**
 *
 *@Author P.K.M Madusha
 *
 */

public interface WalletTransRepository extends CrudRepository<WalletTrans,Long> {
}
