package a1;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f348m = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f349n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioRecord f350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f351b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f357h;
    public j0.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f359k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f352c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f353d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f354e = new AtomicReference(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f360l = false;

    public l(n nVar, Context context) throws i {
        int i = nVar.f369b;
        int i10 = nVar.f371d;
        int i11 = nVar.f372e;
        if (i > 0 && i10 > 0) {
            if (AudioRecord.getMinBufferSize(i, i10 == 1 ? 16 : 12, i11) > 0) {
                try {
                    new AudioFormat.Builder().setSampleRate(i).setChannelMask(i10 == 1 ? 16 : 12).setEncoding(i11).build();
                    this.f351b = nVar;
                    this.f356g = nVar.a();
                    int minBufferSize = AudioRecord.getMinBufferSize(i, i10 == 1 ? 16 : 12, i11);
                    f2.g.h(null, minBufferSize > 0);
                    int i12 = minBufferSize * 2;
                    this.f355f = i12;
                    AudioRecord audioRecordB = b(i12, nVar, context);
                    this.f350a = audioRecordB;
                    if (audioRecordB.getState() == 1) {
                        return;
                    }
                    audioRecordB.release();
                    throw new i("Unable to initialize AudioRecord");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static AudioRecord b(int i, n nVar, Context context) {
        int i10 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(nVar.f369b).setChannelMask(nVar.f371d == 1 ? 16 : 12).setEncoding(nVar.f372e).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (i10 >= 31 && context != null) {
            a2.b.e(builder, context);
        }
        builder.setAudioSource(nVar.f368a);
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final void a() {
        f2.g.h("AudioStream has been released.", !this.f352c.get());
    }

    public final void c(boolean z5) {
        j0.i iVar = this.i;
        f fVar = this.f357h;
        if (iVar == null || fVar == null || Objects.equals(this.f354e.getAndSet(Boolean.valueOf(z5)), Boolean.valueOf(z5))) {
            return;
        }
        iVar.execute(new b(1, fVar, z5));
    }

    public final void d() throws i {
        a();
        AtomicBoolean atomicBoolean = this.f353d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (c1.a.f2187a.i(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.f350a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new i("Unable to initialize AudioRecord");
            }
        }
        this.f350a.startRecording();
        boolean z5 = false;
        if (this.f350a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new i("Unable to start AudioRecord with state: " + this.f350a.getRecordingState());
        }
        this.f358j = 0L;
        this.f360l = false;
        this.f354e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = b1.a.a(this.f350a);
            z5 = audioRecordingConfigurationA != null && b1.a.b(audioRecordingConfigurationA);
        }
        c(z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // a1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a1.o read(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.f353d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            f2.g.h(r1, r0)
            android.media.AudioRecord r0 = r13.f350a
            int r1 = r13.f355f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L8e
            r14.limit(r0)
            boolean r14 = r13.f360l
            r3 = -1
            if (r14 != 0) goto L79
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.f350a
            r6 = 0
            int r5 = r5.getTimestamp(r14, r6)
            if (r5 != 0) goto L72
            a1.n r5 = r13.f351b
            int r5 = r5.f369b
            long r7 = r13.f358j
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L3f
            r9 = r10
            goto L40
        L3f:
            r9 = r6
        L40:
            java.lang.String r11 = "sampleRate must be greater than 0."
            f2.g.a(r11, r9)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L4a
            r6 = r10
        L4a:
            java.lang.String r9 = "framePosition must be no less than 0."
            f2.g.a(r9, r6)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = com.google.android.gms.internal.auth.m.g(r5, r7)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L5e
            goto L5f
        L5e:
            r1 = r7
        L5f:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = a1.l.f348m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L7a
            r13.f360l = r10
            goto L79
        L72:
            java.lang.String r14 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            com.google.android.gms.internal.auth.g.O(r14, r1)
        L79:
            r1 = r3
        L7a:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L82
            long r1 = java.lang.System.nanoTime()
        L82:
            long r3 = r13.f358j
            long r5 = (long) r0
            int r14 = r13.f356g
            long r5 = com.google.android.gms.internal.auth.m.z(r14, r5)
            long r5 = r5 + r3
            r13.f358j = r5
        L8e:
            a1.o r14 = new a1.o
            r14.<init>(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.l.read(java.nio.ByteBuffer):a1.o");
    }
}
