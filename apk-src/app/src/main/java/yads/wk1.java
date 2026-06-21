package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wk1 implements uk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f44418b;

    public wk1(boolean z5, boolean z10) {
        this.f44417a = (z5 || z10) ? 1 : 0;
    }

    @Override // yads.uk1
    public final int a() {
        if (this.f44418b == null) {
            this.f44418b = new MediaCodecList(this.f44417a).getCodecInfos();
        }
        return this.f44418b.length;
    }

    @Override // yads.uk1
    public final boolean b() {
        return true;
    }

    @Override // yads.uk1
    public final MediaCodecInfo a(int i) {
        if (this.f44418b == null) {
            this.f44418b = new MediaCodecList(this.f44417a).getCodecInfos();
        }
        return this.f44418b[i];
    }

    @Override // yads.uk1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.uk1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
