/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.tencent.angel.spark.ml.graph.node2vec

import com.tencent.angel.spark.ml.graph.params._
import org.apache.spark.ml.param.Params

trait Node2VecParams extends Params with HasSrcNodeIdCol with HasDstNodeIdCol with HasPartitionNum with HasPSPartitionNum
  with HasBatchSize with HasWalkLength with HasPValue with HasQValue with HasNeedReplicaEdge
  with HasDegreeBinSize with HasHitRatio with HasPullBatchSize {

  setDefault(srcNodeIdCol, "src")
  setDefault(dstNodeIdCol, "dst")
  setDefault(pValue, 1.0)
  setDefault(qValue, 1.0)
  setDefault(walkLength, 10)
  setDefault(batchSize, 128)
  setDefault(needReplicaEdge, false)
  setDefault(degreeBinSize, 100)
  setDefault(hitRatio, 0.5)
  setDefault(pullBatchSize, 1000)
}