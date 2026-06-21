package e1;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.android.gms.internal.ads.om1;
import yads.cl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15979d;

    public /* synthetic */ q(Object obj, long j10, int i) {
        this.f15977b = i;
        this.f15978c = obj;
        this.f15979d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15977b) {
            case 0:
                c0 c0Var = (c0) this.f15978c;
                long j10 = this.f15979d;
                switch (t.z.m(c0Var.G)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "Pause on ".concat(a0.e.m(j10)));
                        c0Var.f15931p.addLast(Range.create(Long.valueOf(j10), Long.MAX_VALUE));
                        c0Var.k(3);
                        return;
                    case 4:
                        c0Var.k(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var.G)));
                }
            case 1:
                c0 c0Var2 = (c0) this.f15978c;
                long j11 = this.f15979d;
                switch (t.z.m(c0Var2.G)) {
                    case 0:
                        c0Var2.f15941z = null;
                        com.google.android.gms.internal.auth.g.e(c0Var2.f15917a, "Start on ".concat(a0.e.m(j11)));
                        try {
                            if (c0Var2.C) {
                                c0Var2.i();
                            }
                            c0Var2.f15938w = Range.create(Long.valueOf(j11), Long.MAX_VALUE);
                            com.google.android.gms.internal.auth.g.e(c0Var2.f15917a, "mMediaCodec.start()");
                            c0Var2.f15922f.start();
                            k kVar = c0Var2.f15923g;
                            if (kVar instanceof x) {
                                ((x) kVar).a(true);
                            }
                            c0Var2.k(2);
                            return;
                        } catch (MediaCodec.CodecException e3) {
                            c0Var2.b(e3.getMessage(), e3, 1);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        c0Var2.f15941z = null;
                        Range range = (Range) c0Var2.f15931p.removeLast();
                        f2.g.h("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l10 = (Long) range.getLower();
                        long jLongValue = l10.longValue();
                        c0Var2.f15931p.addLast(Range.create(l10, Long.valueOf(j11)));
                        com.google.android.gms.internal.auth.g.e(c0Var2.f15917a, "Resume on " + a0.e.m(j11) + "\nPaused duration = " + a0.e.m(j11 - jLongValue));
                        if ((c0Var2.f15919c || c1.a.f2187a.i(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c0Var2.f15919c || c1.a.f2187a.i(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            c0Var2.j(false);
                            k kVar2 = c0Var2.f15923g;
                            if (kVar2 instanceof x) {
                                ((x) kVar2).a(true);
                            }
                        }
                        if (c0Var2.f15919c) {
                            c0Var2.h();
                        }
                        c0Var2.k(2);
                        return;
                    case 3:
                    case 5:
                        c0Var2.k(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var2.G)));
                }
            default:
                ((cl) this.f15978c).a(this.f15979d);
                return;
        }
    }
}
