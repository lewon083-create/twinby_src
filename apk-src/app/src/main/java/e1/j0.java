package e1;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends d0 implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f15973d = new i0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f15974c;

    public j0(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.f15951b).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f15974c = videoCapabilities;
    }

    @Override // e1.h0
    public final int c() {
        return this.f15974c.getWidthAlignment();
    }

    @Override // e1.h0
    public final Range d() {
        return this.f15974c.getBitrateRange();
    }

    @Override // e1.h0
    public final boolean f() {
        return true;
    }

    @Override // e1.h0
    public final Range h(int i) {
        try {
            return this.f15974c.getSupportedWidthsFor(i);
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException(th2);
        }
    }

    @Override // e1.h0
    public final Range k(int i) {
        try {
            return this.f15974c.getSupportedHeightsFor(i);
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException(th2);
        }
    }

    @Override // e1.h0
    public final int l() {
        return this.f15974c.getHeightAlignment();
    }

    @Override // e1.h0
    public final Range m() {
        return this.f15974c.getSupportedWidths();
    }

    @Override // e1.h0
    public final boolean n(int i, int i10) {
        return this.f15974c.isSizeSupported(i, i10);
    }

    @Override // e1.h0
    public final Range p() {
        return this.f15974c.getSupportedHeights();
    }
}
