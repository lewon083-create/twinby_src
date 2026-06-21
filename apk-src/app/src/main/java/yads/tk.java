package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f43346a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i, int i10) {
        for (int i11 = 8; i11 > 0; i11--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i10).setChannelMask(lb3.a(i11)).build(), f43346a)) {
                return i11;
            }
        }
        return 0;
    }

    public static int[] a() {
        o51 o51Var = r51.f42498c;
        n51 n51Var = new n51();
        zm2 zm2Var = uk.f43698e;
        xm2 xm2Var = zm2Var.f43569c;
        if (xm2Var == null) {
            xm2 xm2Var2 = new xm2(zm2Var, new ym2(zm2Var.f45464f, 0, zm2Var.f45465g));
            zm2Var.f43569c = xm2Var2;
            xm2Var = xm2Var2;
        }
        ma3 it = xm2Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f43346a)) {
                n51Var.a(num);
            }
        }
        n51Var.a((Object) 2);
        return vd1.a(n51Var.a());
    }
}
