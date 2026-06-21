package com.vk.api.sdk.ui;

import android.content.Context;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15103d;

    public /* synthetic */ c(Context context, String str, int i) {
        this.f15101b = i;
        this.f15102c = context;
        this.f15103d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15101b) {
            case 0:
                VKCaptchaActivity.Companion.m28start$lambda0(this.f15102c, this.f15103d);
                break;
            default:
                VKConfirmationActivity.Companion.m32start$lambda0(this.f15102c, this.f15103d);
                break;
        }
    }
}
