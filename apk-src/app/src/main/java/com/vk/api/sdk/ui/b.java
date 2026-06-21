package com.vk.api.sdk.ui;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f15100c;

    public /* synthetic */ b(Activity activity, int i) {
        this.f15099b = i;
        this.f15100c = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15099b) {
            case 0:
                VKCaptchaActivity.m27onCreate$lambda2((VKCaptchaActivity) this.f15100c, dialogInterface);
                break;
            default:
                VKConfirmationActivity.m31onCreate$lambda2((VKConfirmationActivity) this.f15100c, dialogInterface);
                break;
        }
    }
}
