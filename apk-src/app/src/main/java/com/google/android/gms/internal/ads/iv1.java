package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class iv1 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6624b;

    public /* synthetic */ iv1(int i, Object obj) {
        this.f6623a = i;
        this.f6624b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f6623a) {
            case 0:
                yi0 yi0Var = (yi0) this.f6624b;
                yi0Var.h(hv1.a((Context) yi0Var.f12623c, (s50) yi0Var.f12630k, (AudioDeviceInfo) yi0Var.f12629j));
                break;
            default:
                yi0 yi0Var2 = (yi0) this.f6624b;
                yi0Var2.e(u3.b.c((Context) yi0Var2.f12623c, (j3.d) yi0Var2.f12630k, (AudioDeviceInfo) yi0Var2.f12629j));
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.f6623a;
        Object obj = this.f6624b;
        switch (i) {
            case 0:
                yi0 yi0Var = (yi0) obj;
                String str = cq0.f4293a;
                int length = audioDeviceInfoArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (Objects.equals(audioDeviceInfoArr[i10], (AudioDeviceInfo) yi0Var.f12629j)) {
                            yi0Var.f12629j = null;
                        } else {
                            i10++;
                        }
                    }
                }
                yi0Var.h(hv1.a((Context) yi0Var.f12623c, (s50) yi0Var.f12630k, (AudioDeviceInfo) yi0Var.f12629j));
                break;
            default:
                yi0 yi0Var2 = (yi0) obj;
                if (m3.z.m(audioDeviceInfoArr, (AudioDeviceInfo) yi0Var2.f12629j)) {
                    yi0Var2.f12629j = null;
                }
                yi0Var2.e(u3.b.c((Context) yi0Var2.f12623c, (j3.d) yi0Var2.f12630k, (AudioDeviceInfo) yi0Var2.f12629j));
                break;
        }
    }
}
