package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.ir;
import q9.c1;
import q9.n2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends c1 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // q9.d1
    public ir getAdapterCreator() {
        return new fr();
    }

    @Override // q9.d1
    public n2 getLiteSdkVersion() {
        return new n2(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.9.0");
    }
}
