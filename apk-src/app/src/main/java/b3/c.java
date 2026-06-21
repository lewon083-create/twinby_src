package b3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1809b;

    public c(e eVar) {
        this.f1809b = eVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        e eVar = this.f1809b;
        if (mediaCodec != eVar.f1818b) {
            return;
        }
        Log.e("HeifEncoder", "onError: " + codecException);
        ac.c cVar = eVar.f1819c;
        eVar.j();
        if (codecException == null) {
            cVar.t(null);
        } else {
            cVar.t(codecException);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        e eVar = this.f1809b;
        if (mediaCodec != eVar.f1818b || eVar.f1830o) {
            return;
        }
        eVar.f1836u.add(Integer.valueOf(i));
        eVar.h();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != this.f1809b.f1818b || this.f1808a) {
            return;
        }
        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
            ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            d dVar = this.f1809b.f1837v;
            if (dVar != null) {
                long j10 = bufferInfo.presentationTimeUs;
                synchronized (dVar) {
                    dVar.f1815f = j10;
                    dVar.a();
                }
            }
            ac.c cVar = this.f1809b.f1819c;
            f fVar = (f) cVar.f739c;
            if (!cVar.f738b) {
                if (fVar.f1849j == null) {
                    cVar.t(new IllegalStateException("Output buffer received before format info"));
                } else {
                    if (fVar.f1850k < fVar.f1845e * fVar.f1844d) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.set(outputBuffer.position(), outputBuffer.remaining(), 0L, 0);
                        fVar.f1847g.writeSampleData(fVar.f1849j[fVar.f1850k / fVar.f1844d], outputBuffer, bufferInfo2);
                    }
                    int i10 = fVar.f1850k + 1;
                    fVar.f1850k = i10;
                    if (i10 == fVar.f1845e * fVar.f1844d) {
                        cVar.t(null);
                    }
                }
            }
        }
        this.f1808a |= (bufferInfo.flags & 4) != 0;
        mediaCodec.releaseOutputBuffer(i, false);
        if (this.f1808a) {
            e eVar = this.f1809b;
            ac.c cVar2 = eVar.f1819c;
            eVar.j();
            cVar2.t(null);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        e eVar = this.f1809b;
        if (mediaCodec != eVar.f1818b) {
            return;
        }
        if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
            mediaFormat.setString("mime", "image/vnd.android.heic");
            mediaFormat.setInteger("width", eVar.f1822f);
            mediaFormat.setInteger("height", eVar.f1823g);
            if (eVar.f1828m) {
                mediaFormat.setInteger("tile-width", eVar.f1824h);
                mediaFormat.setInteger("tile-height", eVar.i);
                mediaFormat.setInteger("grid-rows", eVar.f1825j);
                mediaFormat.setInteger("grid-cols", eVar.f1826k);
            }
        }
        ac.c cVar = eVar.f1819c;
        f fVar = (f) cVar.f739c;
        if (cVar.f738b) {
            return;
        }
        if (fVar.f1849j != null) {
            cVar.t(new IllegalStateException("Output format changed after muxer started"));
            return;
        }
        try {
            fVar.f1844d = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
        } catch (ClassCastException | NullPointerException unused) {
            fVar.f1844d = 1;
        }
        fVar.f1849j = new int[fVar.f1845e];
        int i = 0;
        while (i < fVar.f1849j.length) {
            mediaFormat.setInteger("is-default", i == 0 ? 1 : 0);
            fVar.f1849j[i] = fVar.f1847g.addTrack(mediaFormat);
            i++;
        }
        fVar.f1847g.start();
        fVar.i.set(true);
        fVar.b();
    }
}
