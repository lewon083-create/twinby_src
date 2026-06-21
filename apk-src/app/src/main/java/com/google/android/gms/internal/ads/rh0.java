package com.google.android.gms.internal.ads;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.WebView;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh0 implements uh0, io.flutter.plugin.platform.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9942g;

    public /* synthetic */ rh0(int i, int i10, WebView webView, String str, String str2, String str3) {
        this.f9939d = str;
        this.f9937b = i;
        this.f9940e = str2;
        this.f9942g = webView;
        this.f9941f = str3;
        this.f9938c = i10;
    }

    public static boolean b(rh0 rh0Var) {
        return Objects.equals(((j3.o) rh0Var.f9939d).f26335n, "audio/raw");
    }

    @Override // io.flutter.plugin.platform.h
    public void a(int i, int i10) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = (ImageReader) this.f9940e;
        if (imageReader != null && this.f9937b == i && this.f9938c == i10) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f9939d).pushImage(null);
            ((ImageReader) this.f9940e).close();
            this.f9940e = null;
        }
        this.f9937b = i;
        this.f9938c = i10;
        Handler handler = (Handler) this.f9941f;
        io.flutter.plugin.platform.c cVar = (io.flutter.plugin.platform.c) this.f9942g;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            a6.m.q();
            ImageReader.Builder builderK = a6.m.k(this.f9937b, this.f9938c);
            builderK.setMaxImages(4);
            builderK.setImageFormat(34);
            builderK.setUsage(256L);
            imageReaderNewInstance = builderK.build();
            imageReaderNewInstance.setOnImageAvailableListener(cVar, handler);
        } else {
            if (i11 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i, i10, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(cVar, handler);
        }
        this.f9940e = imageReaderNewInstance;
    }

    public /* synthetic */ boolean c() {
        return Objects.equals(((jx1) this.f9939d).f6975m, "audio/raw");
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return this.f9938c;
    }

    @Override // io.flutter.plugin.platform.h
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f9939d).id();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((ImageReader) this.f9940e).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return this.f9937b;
    }

    @Override // com.google.android.gms.internal.ads.uh0
    public Object h() {
        String str = (String) this.f9939d;
        int i = this.f9937b;
        String str2 = (String) this.f9940e;
        WebView webView = (WebView) this.f9942g;
        String str3 = (String) this.f9941f;
        int i10 = this.f9938c;
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        dl dlVar = new dl("Google", str);
        zt0 zt0VarO = l80.o("javascript");
        vt0 vt0VarQ = l80.q(a0.u.d(i));
        zt0 zt0Var = zt0.NONE;
        if (zt0VarO == zt0Var) {
            u9.i.h("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (vt0VarQ == null) {
            u9.i.h("Omid html session error; Unable to parse creative type: ".concat(a0.u.x(i)));
            return null;
        }
        zt0 zt0VarO2 = l80.o(str2);
        if (vt0VarQ == vt0.VIDEO && zt0VarO2 == zt0Var) {
            u9.i.h("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str2)));
            return null;
        }
        k7 k7Var = new k7(dlVar, webView, str3, "", tt0.HTML);
        yv0 yv0VarB = yv0.b(vt0VarQ, l80.p(a0.u.e(i10)), zt0VarO, zt0VarO2, true);
        if (nz.A.f12499c) {
            return new wh0(new ut0(yv0VarB, k7Var, UUID.randomUUID().toString()), k7Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        if (((ImageReader) this.f9940e) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f9939d).pushImage(null);
            ((ImageReader) this.f9940e).close();
            this.f9940e = null;
        }
        this.f9939d = null;
    }

    public /* synthetic */ rh0(Object obj, Object obj2, int i, int i10, Object obj3, Object obj4) {
        this.f9939d = obj;
        this.f9940e = obj2;
        this.f9937b = i;
        this.f9938c = i10;
        this.f9941f = obj3;
        this.f9942g = obj4;
    }

    public rh0(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f9937b = 0;
        this.f9938c = 0;
        this.f9941f = new Handler();
        this.f9942g = new io.flutter.plugin.platform.c(this);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9939d = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
}
