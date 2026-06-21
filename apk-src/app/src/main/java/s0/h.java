package s0;

import a0.i0;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32405g;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(i0 i0Var, d dVar) {
        String str;
        String str2 = i0Var.a() ? i.f32409d : i.f32408c;
        try {
            switch (dVar.f32394a) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (!str.contains("vTextureCoord") || !str.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str2, str);
            this.f32403e = -1;
            this.f32404f = -1;
            this.f32405g = -1;
            a();
            int i = this.f32399a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
            this.f32403e = iGlGetUniformLocation;
            i.e(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
            this.f32405g = iGlGetAttribLocation;
            i.e(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.f32404f = iGlGetUniformLocation2;
            i.e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th2) {
            if (!(th2 instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
            }
            throw th2;
        }
    }

    @Override // s0.g
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.f32403e, 0);
        GLES20.glEnableVertexAttribArray(this.f32405g);
        i.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f32405g, 2, 5126, false, 0, (Buffer) i.i);
        i.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(i0 i0Var, f fVar) {
        d dVar;
        if (i0Var.a()) {
            f2.g.a("No default sampler shader available for" + fVar, fVar != f.f32395b);
            if (fVar == f.f32397d) {
                dVar = i.f32412g;
            } else {
                dVar = i.f32411f;
            }
        } else {
            dVar = i.f32410e;
        }
        this(i0Var, dVar);
    }
}
