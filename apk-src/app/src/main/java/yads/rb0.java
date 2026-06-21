package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx0 f42527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42534h;
    public final bl[] i;

    public rb0(nx0 nx0Var, int i, int i10, int i11, int i12, int i13, int i14, int i15, bl[] blVarArr) {
        this.f42527a = nx0Var;
        this.f42528b = i;
        this.f42529c = i10;
        this.f42530d = i11;
        this.f42531e = i12;
        this.f42532f = i13;
        this.f42533g = i14;
        this.f42534h = i15;
        this.i = blVarArr;
    }

    public final AudioTrack a(boolean z5, pk pkVar, int i) {
        try {
            AudioTrack audioTrackB = b(z5, pkVar, i);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new fl(state, this.f42531e, this.f42532f, this.f42534h, this.f42527a, this.f42529c == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e3) {
            throw new fl(0, this.f42531e, this.f42532f, this.f42534h, this.f42527a, this.f42529c == 1, e3);
        }
    }

    public final AudioTrack b(boolean z5, pk pkVar, int i) {
        AudioAttributes audioAttributesBuild;
        AudioAttributes audioAttributesBuild2;
        int i10 = lb3.f40466a;
        if (i10 >= 29) {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(this.f42531e).setChannelMask(this.f42532f).setEncoding(this.f42533g).build();
            if (z5) {
                audioAttributesBuild2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (pkVar.f41943g == null) {
                    pkVar.f41943g = new ok(pkVar);
                }
                audioAttributesBuild2 = pkVar.f41943g.f41551a;
            }
            return new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild2).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(this.f42534h).setSessionId(i).setOffloadedPlayback(this.f42529c == 1).build();
        }
        if (i10 < 21) {
            int iC = lb3.c(pkVar.f41940d);
            return i == 0 ? new AudioTrack(iC, this.f42531e, this.f42532f, this.f42533g, this.f42534h, 1) : new AudioTrack(iC, this.f42531e, this.f42532f, this.f42533g, this.f42534h, 1, i);
        }
        if (z5) {
            audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            if (pkVar.f41943g == null) {
                pkVar.f41943g = new ok(pkVar);
            }
            audioAttributesBuild = pkVar.f41943g.f41551a;
        }
        return new AudioTrack(audioAttributesBuild, new AudioFormat.Builder().setSampleRate(this.f42531e).setChannelMask(this.f42532f).setEncoding(this.f42533g).build(), this.f42534h, 1, i);
    }
}
