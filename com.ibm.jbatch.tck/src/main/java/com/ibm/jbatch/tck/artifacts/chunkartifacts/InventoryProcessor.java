/**
 * Copyright 2012, 2020 International Business Machines Corp. and others
 * <p>
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * SPDX-License-Identifier: Apache-2.0
 */
package com.ibm.jbatch.tck.artifacts.chunkartifacts;

import com.ibm.jbatch.tck.artifacts.chunktypes.InventoryRecord;


@jakarta.inject.Named("inventoryProcessor")
public class InventoryProcessor implements jakarta.batch.api.chunk.ItemProcessor {


    @Override
    public InventoryRecord processItem(Object record) throws Exception {


        //The processor doesn't really do anything in this test. It just passes along
        //the item item and the quantity to the item writer to create and order in the
        //order table.

        int itemID = ((InventoryRecord) record).getItemID();
        int quantity = ((InventoryRecord) record).getQuantity();

        return new InventoryRecord(itemID, quantity);
    }

}
