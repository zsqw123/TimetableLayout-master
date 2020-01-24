package io.moyuru.timetablelayoutsample.item

import com.xwray.groupie.databinding.BindableItem
import io.moyuru.timetablelayoutsample.R
import io.moyuru.timetablelayoutsample.databinding.ItemSpaceBinding

class SpaceItem : BindableItem<ItemSpaceBinding>() {
  override fun getLayout() = R.layout.item_space

  override fun bind(viewBinding: ItemSpaceBinding, position: Int) {
  }
}