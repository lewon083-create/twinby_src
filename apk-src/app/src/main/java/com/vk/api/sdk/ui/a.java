package com.vk.api.sdk.ui;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function0;
import yads.o90;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15098c;

    public /* synthetic */ a(int i, Object obj) {
        this.f15097b = i;
        this.f15098c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f15097b) {
            case 0:
                VKCaptchaActivity.m25onCreate$lambda0((VKCaptchaActivity) this.f15098c, dialogInterface, i);
                break;
            case 1:
                VKCaptchaActivity.m26onCreate$lambda1((VKCaptchaActivity) this.f15098c, dialogInterface, i);
                break;
            default:
                o90.a((Function0) this.f15098c, dialogInterface, i);
                break;
        }
    }
}
