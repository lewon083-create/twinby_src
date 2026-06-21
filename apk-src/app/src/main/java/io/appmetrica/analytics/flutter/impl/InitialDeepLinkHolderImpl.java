package io.appmetrica.analytics.flutter.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class InitialDeepLinkHolderImpl implements Pigeon.InitialDeepLinkHolderPigeon {
    public Activity activity = null;

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon
    public String getInitialDeeplink() {
        Intent intent;
        Activity activity = this.activity;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getDataString();
    }
}
