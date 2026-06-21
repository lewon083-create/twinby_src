package b3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    public final int A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodec f1818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac.c f1819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1824h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f1831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f1833r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f1837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SurfaceTexture f1838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Surface f1839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s7.g f1840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f1841z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f1834s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f1835t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f1836u = new ArrayList();
    public final float[] B = new float[16];

    public e(int i, int i10, int i11, Handler handler, ac.c cVar) throws IOException {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z5;
        int i12;
        int i13;
        int i14;
        int iGlCreateProgram;
        int iC;
        if (i < 0 || i10 < 0 || i11 < 0 || i11 > 100) {
            throw new IllegalArgumentException("invalid encoder inputs");
        }
        int i15 = 512;
        boolean z10 = i > 512 || i10 > 512;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("image/vnd.android.heic");
            this.f1818b = mediaCodecCreateEncoderByType;
            capabilitiesForType = mediaCodecCreateEncoderByType.getCodecInfo().getCapabilitiesForType("image/vnd.android.heic");
            if (!capabilitiesForType.getVideoCapabilities().isSizeSupported(i, i10)) {
                this.f1818b.release();
                this.f1818b = null;
                throw new Exception();
            }
            z5 = true;
        } catch (Exception unused) {
            MediaCodec mediaCodecCreateEncoderByType2 = MediaCodec.createEncoderByType("video/hevc");
            this.f1818b = mediaCodecCreateEncoderByType2;
            capabilitiesForType = mediaCodecCreateEncoderByType2.getCodecInfo().getCapabilitiesForType("video/hevc");
            z10 |= !capabilitiesForType.getVideoCapabilities().isSizeSupported(i, i10);
            z5 = false;
        }
        this.f1821e = 2;
        this.f1819c = cVar;
        Looper looper = handler.getLooper();
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        Handler handler2 = new Handler(looper);
        this.f1820d = handler2;
        this.f1822f = i;
        this.f1823g = i10;
        this.f1828m = z10;
        if (z10) {
            i13 = (i + 511) / 512;
            i14 = (i10 + 511) / 512;
            i12 = 512;
        } else {
            i15 = i;
            i12 = i10;
            i13 = 1;
            i14 = 1;
        }
        MediaFormat mediaFormatCreateVideoFormat = z5 ? MediaFormat.createVideoFormat("image/vnd.android.heic", i, i10) : MediaFormat.createVideoFormat("video/hevc", i15, i12);
        if (z10) {
            mediaFormatCreateVideoFormat.setInteger("tile-width", i15);
            mediaFormatCreateVideoFormat.setInteger("tile-height", i12);
            mediaFormatCreateVideoFormat.setInteger("grid-cols", i13);
            mediaFormatCreateVideoFormat.setInteger("grid-rows", i14);
        }
        if (z5) {
            this.f1824h = i;
            this.i = i10;
            this.f1825j = 1;
            this.f1826k = 1;
        } else {
            this.f1824h = i15;
            this.i = i12;
            this.f1825j = i14;
            this.f1826k = i13;
        }
        int i16 = this.f1825j * this.f1826k;
        this.f1827l = i16;
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 0);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i16);
        mediaFormatCreateVideoFormat.setInteger("capture-rate", i16 * 30);
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities.isBitrateModeSupported(0)) {
            Log.d("HeifEncoder", "Setting bitrate mode to constant quality");
            Range qualityRange = encoderCapabilities.getQualityRange();
            Log.d("HeifEncoder", "Quality range: " + qualityRange);
            mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 0);
            mediaFormatCreateVideoFormat.setInteger("quality", (int) ((((double) ((((Integer) qualityRange.getUpper()).intValue() - ((Integer) qualityRange.getLower()).intValue()) * i11)) / 100.0d) + ((double) ((Integer) qualityRange.getLower()).intValue())));
        } else {
            if (encoderCapabilities.isBitrateModeSupported(2)) {
                Log.d("HeifEncoder", "Setting bitrate mode to constant bitrate");
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
            } else {
                Log.d("HeifEncoder", "Setting bitrate mode to variable bitrate");
                mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 1);
            }
            mediaFormatCreateVideoFormat.setInteger("bitrate", (int) (((((((double) (i * i10)) * 1.5d) * 8.0d) * 0.25d) * ((double) i11)) / 100.0d));
        }
        this.f1818b.setCallback(new c(this), handler2);
        this.f1818b.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        Surface surfaceCreateInputSurface = this.f1818b.createInputSurface();
        this.f1839x = surfaceCreateInputSurface;
        this.f1837v = new d(this, true);
        s7.g gVar = new s7.g();
        gVar.f32795b = EGL14.EGL_NO_DISPLAY;
        gVar.f32796c = EGL14.EGL_NO_CONTEXT;
        gVar.f32797d = EGL14.EGL_NO_SURFACE;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        surfaceCreateInputSurface.getClass();
        gVar.f32798e = surfaceCreateInputSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        gVar.f32795b = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) gVar.f32795b, iArr, 0, iArr, 1)) {
            gVar.f32795b = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        if (!EGL14.eglChooseConfig((EGLDisplay) gVar.f32795b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        gVar.f32796c = EGL14.eglCreateContext((EGLDisplay) gVar.f32795b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        s7.g.u("eglCreateContext");
        if (((EGLContext) gVar.f32796c) == null) {
            throw new RuntimeException("null context");
        }
        gVar.f32797d = EGL14.eglCreateWindowSurface((EGLDisplay) gVar.f32795b, eGLConfigArr[0], (Surface) gVar.f32798e, new int[]{12344}, 0);
        s7.g.u("eglCreateWindowSurface");
        EGLSurface eGLSurface = (EGLSurface) gVar.f32797d;
        if (eGLSurface == null) {
            throw new RuntimeException("surface was null");
        }
        EGL14.eglQuerySurface((EGLDisplay) gVar.f32795b, eGLSurface, 12375, new int[1], 0);
        EGL14.eglQuerySurface((EGLDisplay) gVar.f32795b, (EGLSurface) gVar.f32797d, 12374, new int[1], 0);
        this.f1840y = gVar;
        gVar.E();
        g gVar2 = new g();
        gVar2.f1860f = 3553;
        int iC2 = g.c(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (iC2 == 0 || (iC = g.c(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
            iGlCreateProgram = 0;
        } else {
            iGlCreateProgram = GLES20.glCreateProgram();
            g.a("glCreateProgram");
            if (iGlCreateProgram == 0) {
                Log.e("Texture2dProgram", "Could not create program");
            }
            GLES20.glAttachShader(iGlCreateProgram, iC2);
            g.a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iC);
            g.a("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] != 1) {
                Log.e("Texture2dProgram", "Could not link program: ");
                Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        gVar2.f1855a = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        gVar2.f1858d = iGlGetAttribLocation;
        g.b(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(gVar2.f1855a, "aTextureCoord");
        gVar2.f1859e = iGlGetAttribLocation2;
        g.b(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(gVar2.f1855a, "uMVPMatrix");
        gVar2.f1856b = iGlGetUniformLocation;
        g.b(iGlGetUniformLocation, "uMVPMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(gVar2.f1855a, "uTexMatrix");
        gVar2.f1857c = iGlGetUniformLocation2;
        g.b(iGlGetUniformLocation2, "uTexMatrix");
        a aVar = new a(gVar2, i, i10);
        this.f1841z = aVar;
        g gVar3 = aVar.f1805e;
        gVar3.getClass();
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        g.a("glGenTextures");
        int i17 = iArr3[0];
        int i18 = gVar3.f1860f;
        GLES20.glBindTexture(i18, i17);
        g.a("glBindTexture " + i17);
        GLES20.glTexParameterf(i18, 10241, 9728.0f);
        GLES20.glTexParameterf(i18, 10240, i18 != 3553 ? 9729.0f : 9728.0f);
        GLES20.glTexParameteri(i18, 10242, 33071);
        GLES20.glTexParameteri(i18, 10243, 33071);
        g.a("glTexParameter");
        this.A = i17;
        this.f1840y.G();
        this.f1832q = new Rect(0, 0, this.f1824h, this.i);
        this.f1831p = new Rect();
    }

    public final void a(Bitmap bitmap) {
        if (this.f1821e != 2) {
            throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
        }
        if (this.f1837v.b(b(this.f1829n) * 1000, b((this.f1829n + this.f1827l) - 1))) {
            synchronized (this) {
                try {
                    s7.g gVar = this.f1840y;
                    if (gVar == null) {
                        return;
                    }
                    gVar.E();
                    a aVar = this.f1841z;
                    int i = this.A;
                    int i10 = aVar.f1805e.f1860f;
                    GLES20.glBindTexture(i10, i);
                    GLUtils.texImage2D(i10, 0, bitmap, 0);
                    d();
                    this.f1840y.G();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final long b(int i) {
        return ((((long) i) * 1000000) / ((long) this.f1827l)) + 132;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f1834s) {
            this.f1830o = true;
            this.f1834s.notifyAll();
        }
        this.f1820d.postAtFrontOfQueue(new b(this, 1));
    }

    public final void d() {
        int i = this.f1824h;
        int i10 = this.i;
        GLES20.glViewport(0, 0, i, i10);
        for (int i11 = 0; i11 < this.f1825j; i11++) {
            for (int i12 = 0; i12 < this.f1826k; i12++) {
                int i13 = i12 * i;
                int i14 = i11 * i10;
                Rect rect = this.f1831p;
                rect.set(i13, i14, i13 + i, i14 + i10);
                a aVar = this.f1841z;
                float[] fArr = g.f1854h;
                float[] fArr2 = aVar.f1801a;
                float f10 = rect.left;
                float f11 = aVar.f1803c;
                float f12 = f10 / f11;
                fArr2[0] = f12;
                float f13 = rect.bottom;
                float f14 = aVar.f1804d;
                float f15 = 1.0f - (f13 / f14);
                fArr2[1] = f15;
                float f16 = rect.right / f11;
                fArr2[2] = f16;
                fArr2[3] = f15;
                fArr2[4] = f12;
                float f17 = 1.0f - (rect.top / f14);
                fArr2[5] = f17;
                fArr2[6] = f16;
                fArr2[7] = f17;
                FloatBuffer floatBuffer = aVar.f1802b;
                floatBuffer.put(fArr2);
                floatBuffer.position(0);
                g gVar = aVar.f1805e;
                float[] fArr3 = g.f1853g;
                FloatBuffer floatBuffer2 = a.f1800f;
                FloatBuffer floatBuffer3 = aVar.f1802b;
                gVar.getClass();
                g.a("draw start");
                GLES20.glUseProgram(gVar.f1855a);
                g.a("glUseProgram");
                GLES20.glActiveTexture(33984);
                int i15 = gVar.f1860f;
                GLES20.glBindTexture(i15, this.A);
                GLES20.glUniformMatrix4fv(gVar.f1856b, 1, false, fArr3, 0);
                g.a("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(gVar.f1857c, 1, false, fArr, 0);
                g.a("glUniformMatrix4fv");
                int i16 = gVar.f1858d;
                GLES20.glEnableVertexAttribArray(i16);
                g.a("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(gVar.f1858d, 2, 5126, false, 8, (Buffer) floatBuffer2);
                g.a("glVertexAttribPointer");
                int i17 = gVar.f1859e;
                GLES20.glEnableVertexAttribArray(i17);
                g.a("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(gVar.f1859e, 2, 5126, false, 8, (Buffer) floatBuffer3);
                g.a("glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, 4);
                g.a("glDrawArrays");
                GLES20.glDisableVertexAttribArray(i16);
                GLES20.glDisableVertexAttribArray(i17);
                GLES20.glBindTexture(i15, 0);
                GLES20.glUseProgram(0);
                s7.g gVar2 = this.f1840y;
                int i18 = this.f1829n;
                this.f1829n = i18 + 1;
                EGLExt.eglPresentationTimeANDROID((EGLDisplay) gVar2.f32795b, (EGLSurface) gVar2.f32797d, b(i18) * 1000);
                s7.g gVar3 = this.f1840y;
                EGL14.eglSwapBuffers((EGLDisplay) gVar3.f32795b, (EGLSurface) gVar3.f32797d);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0178, code lost:
    
        throw new java.lang.IllegalArgumentException("src and dst rect size are different!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.e.h():void");
    }

    public final void i() {
        ByteBuffer byteBuffer;
        int i = this.f1821e;
        if (i == 2) {
            d dVar = this.f1837v;
            synchronized (dVar) {
                try {
                    if (dVar.f1810a) {
                        if (dVar.f1811b < 0) {
                            dVar.f1811b = 0L;
                        }
                    } else if (dVar.f1813d < 0) {
                        dVar.f1813d = 0L;
                    }
                    dVar.a();
                } finally {
                }
            }
            return;
        }
        if (i == 0) {
            synchronized (this.f1834s) {
                while (!this.f1830o && this.f1834s.isEmpty()) {
                    try {
                        this.f1834s.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                byteBuffer = this.f1830o ? null : (ByteBuffer) this.f1834s.remove(0);
            }
            if (byteBuffer == null) {
                return;
            }
            byteBuffer.clear();
            byteBuffer.flip();
            synchronized (this.f1835t) {
                this.f1835t.add(byteBuffer);
            }
            this.f1820d.post(new b(this, 0));
        }
    }

    public final void j() {
        MediaCodec mediaCodec = this.f1818b;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f1818b.release();
            this.f1818b = null;
        }
        synchronized (this.f1834s) {
            this.f1830o = true;
            this.f1834s.notifyAll();
        }
        synchronized (this) {
            try {
                a aVar = this.f1841z;
                if (aVar != null) {
                    if (aVar.f1805e != null) {
                        aVar.f1805e = null;
                    }
                    this.f1841z = null;
                }
                s7.g gVar = this.f1840y;
                if (gVar != null) {
                    gVar.H();
                    this.f1840y = null;
                }
                SurfaceTexture surfaceTexture = this.f1838w;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.f1838w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            try {
                s7.g gVar = this.f1840y;
                if (gVar == null) {
                    return;
                }
                gVar.E();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.B);
                if (this.f1837v.b(surfaceTexture.getTimestamp(), b((this.f1829n + this.f1827l) - 1))) {
                    d();
                }
                surfaceTexture.releaseTexImage();
                this.f1840y.G();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
