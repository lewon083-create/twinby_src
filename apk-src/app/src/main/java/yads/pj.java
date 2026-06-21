package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import yads.pj;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pj implements dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b53 f41931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b53 f41932b;

    /* JADX WARN: Illegal instructions before constructor call */
    public pj(final int i) {
        final int i10 = 0;
        final int i11 = 1;
        this(new b53() { // from class: zl.r0
            @Override // yads.b53
            public final Object get() {
                switch (i10) {
                    case 0:
                        return pj.a(i);
                    default:
                        return pj.b(i);
                }
            }
        }, new b53() { // from class: zl.r0
            @Override // yads.b53
            public final Object get() {
                switch (i11) {
                    case 0:
                        return pj.a(i);
                    default:
                        return pj.b(i);
                }
            }
        });
    }

    @Override // yads.dk1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qj a(ck1 ck1Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ck1Var.f37415a.f40227a;
        qj qjVar = null;
        try {
            g73.a("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                qj qjVar2 = new qj(mediaCodecCreateByCodecName, (HandlerThread) this.f41931a.get(), (HandlerThread) this.f41932b.get(), false);
                try {
                    g73.a();
                    qjVar2.a(ck1Var.f37416b, ck1Var.f37418d, ck1Var.f37419e);
                    return qjVar2;
                } catch (Exception e3) {
                    e = e3;
                    qjVar = qjVar2;
                    if (qjVar != null) {
                        qjVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodecCreateByCodecName = null;
        }
    }

    public pj(b53 b53Var, b53 b53Var2) {
        this.f41931a = b53Var;
        this.f41932b = b53Var2;
    }

    public static HandlerThread a(int i) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }

    public static HandlerThread b(int i) {
        StringBuilder sb2 = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return new HandlerThread(sb2.toString());
    }
}
