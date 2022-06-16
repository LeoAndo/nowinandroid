package com.google.samples.apps.nowinandroid.core.ui.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true,
    device = Devices.PHONE,
    name = "Phone Landscape"
)
@Preview(
    showBackground = true,
    device = Devices.TABLET,
    name = "Tablet"
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL,
    device = Devices.FOLDABLE,
    name = "Foldable"
)
annotation class PreviewDevices() {}
