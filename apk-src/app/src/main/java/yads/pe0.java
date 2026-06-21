package yads;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41905a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41908d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0 f41906b = new ee0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41907c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qk1 f41909e = qk1.f42328a;

    public pe0(Context context) {
        this.f41905a = context;
    }

    public final ro[] a(Handler handler, xn0 xn0Var, xn0 xn0Var2, xn0 xn0Var3, xn0 xn0Var4) {
        int i;
        Class cls;
        int i10;
        int i11;
        int i12;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        ArrayList arrayList = new ArrayList();
        Context context = this.f41905a;
        int i13 = this.f41907c;
        arrayList.add(new dl1(context, this.f41906b, this.f41909e, this.f41908d, handler, xn0Var));
        if (i13 != 0) {
            int size = arrayList.size();
            if (i13 == 2) {
                size--;
            }
            try {
                try {
                    i12 = size + 1;
                    try {
                        arrayList.add(size, (ro) Class.forName("com.monetization.ads.exo.ext.vp9.LibvpxVideoRenderer").getConstructor(cls3, Handler.class, gj3.class, cls2).newInstance(5000L, handler, xn0Var, 50));
                        kh1.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i12;
                        i12 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    arrayList.add(i12, (ro) Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer").getConstructor(cls3, Handler.class, gj3.class, cls2).newInstance(5000L, handler, xn0Var, 50));
                    kh1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating AV1 extension", e3);
                }
            } catch (Exception e7) {
                throw new RuntimeException("Error instantiating VP9 extension", e7);
            }
        }
        Context context2 = this.f41905a;
        qb0 qb0Var = new qb0();
        uk ukVarA = uk.a(context2);
        ukVarA.getClass();
        qb0Var.f42236a = ukVarA;
        qb0Var.f42238c = false;
        qb0Var.f42239d = false;
        qb0Var.f42240e = 0;
        if (qb0Var.f42237b == null) {
            qb0Var.f42237b = new sb0(new bl[0], new wy2(0), new g23());
        }
        zb0 zb0Var = new zb0(qb0Var);
        Context context3 = this.f41905a;
        int i14 = this.f41907c;
        arrayList.add(new hk1(context3, this.f41906b, this.f41909e, this.f41908d, handler, xn0Var2, zb0Var));
        if (i14 != 0) {
            int size2 = arrayList.size();
            if (i14 == 2) {
                size2--;
            }
            try {
                try {
                    i = size2 + 1;
                    try {
                        arrayList.add(size2, (ro) Class.forName("com.monetization.ads.exo.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        kh1.c("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused4) {
                        size2 = i;
                        i = size2;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating MIDI extension", e10);
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                try {
                    cls = jl.class;
                    try {
                        i10 = i + 1;
                        try {
                            arrayList.add(i, (ro) Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var));
                            kh1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused6) {
                            i = i10;
                            i10 = i;
                        }
                    } catch (ClassNotFoundException unused7) {
                    }
                } catch (ClassNotFoundException unused8) {
                    cls = jl.class;
                }
                try {
                    try {
                        i11 = i10 + 1;
                        try {
                            arrayList.add(i10, (ro) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var));
                            kh1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i10 = i11;
                            i11 = i10;
                        }
                    } catch (Exception e11) {
                        throw new RuntimeException("Error instantiating FLAC extension", e11);
                    }
                } catch (ClassNotFoundException unused10) {
                }
                try {
                    arrayList.add(i11, (ro) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var));
                    kh1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e12) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e12);
                }
            } catch (Exception e13) {
                throw new RuntimeException("Error instantiating Opus extension", e13);
            }
        }
        arrayList.add(new d63(xn0Var3, handler.getLooper()));
        arrayList.add(new at1(xn0Var4, handler.getLooper()));
        arrayList.add(new bt());
        return (ro[]) arrayList.toArray(new ro[0]);
    }
}
