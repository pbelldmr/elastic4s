package com.sksamuel.elastic4s.fields

case class DoubleRangeField(name: String,
                            boost: Option[Double] = None,
                            coerce: Option[Boolean] = None,
                            index: Option[Boolean] = None,
                            store: Option[Boolean] = None) extends RangeField {
  override def `type`: String = "double_range"
}
