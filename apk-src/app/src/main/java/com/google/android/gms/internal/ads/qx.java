package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qx extends sx implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f9619u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sz f9620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dy f9621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sd0 f9623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9624h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaPlayer f9625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f9626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ay f9630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vx f9633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f9635t;

    static {
        HashMap map = new HashMap();
        f9619u = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(Integer.valueOf(VKApiCodes.CODE_VIDEO_ALREADY_ADDED), "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(Integer.valueOf(VKApiCodes.CODE_ERROR_VIDEO_COMMENTS_CLOSED), "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(Integer.valueOf(VKApiCodes.CODE_MSG_SEND_RECIPIENT_FORBID_GROUPS_MSGS), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(Integer.valueOf(VKApiCodes.CODE_MSG_SEND_VIOLATION_OF_PRIVACY_SETTINGS), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public qx(Context context, sz szVar, boolean z5, boolean z10, dy dyVar, sd0 sd0Var) {
        super(context);
        this.f9624h = 0;
        this.i = 0;
        this.f9634s = false;
        this.f9635t = null;
        this.f9620d = szVar;
        this.f9621e = dyVar;
        this.f9631p = z5;
        this.f9622f = z10;
        dyVar.a(this);
        this.f9623g = sd0Var;
    }

    public final void D() {
        SurfaceTexture surfaceTexture;
        sd0 sd0Var;
        t9.c0.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f9626k == null || surfaceTexture2 == null) {
            return;
        }
        E(false);
        try {
            ob.a0 a0Var = p9.k.C.f31314u;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f9625j = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f9625j.setOnCompletionListener(this);
            this.f9625j.setOnErrorListener(this);
            this.f9625j.setOnInfoListener(this);
            this.f9625j.setOnPreparedListener(this);
            this.f9625j.setOnVideoSizeChangedListener(this);
            this.f9629n = 0;
            if (this.f9631p) {
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3292ye)).booleanValue() && (sd0Var = this.f9623g) != null) {
                    zd1 zd1VarA = sd0Var.a();
                    zd1VarA.v("action", "svp_ampv");
                    zd1VarA.w();
                }
                ay ayVar = new ay(getContext());
                this.f9630o = ayVar;
                int width = getWidth();
                int height = getHeight();
                ayVar.f3465n = width;
                ayVar.f3464m = height;
                ayVar.f3467p = surfaceTexture2;
                ay ayVar2 = this.f9630o;
                ayVar2.start();
                if (ayVar2.f3467p == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        ayVar2.f3472u.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = ayVar2.f3466o;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f9630o.b();
                    this.f9630o = null;
                }
            }
            this.f9625j.setDataSource(getContext(), this.f9626k);
            this.f9625j.setSurface(new Surface(surfaceTexture2));
            this.f9625j.setAudioStreamType(3);
            this.f9625j.setScreenOnWhilePlaying(true);
            this.f9625j.prepareAsync();
            G(1);
        } catch (IOException e3) {
            e = e3;
            u9.i.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f9626k)), e);
            onError(this.f9625j, 1, 0);
        } catch (IllegalArgumentException e7) {
            e = e7;
            u9.i.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f9626k)), e);
            onError(this.f9625j, 1, 0);
        } catch (IllegalStateException e10) {
            e = e10;
            u9.i.i("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f9626k)), e);
            onError(this.f9625j, 1, 0);
        }
    }

    public final void E(boolean z5) {
        t9.c0.m("AdMediaPlayerView release");
        ay ayVar = this.f9630o;
        if (ayVar != null) {
            ayVar.b();
            this.f9630o = null;
        }
        MediaPlayer mediaPlayer = this.f9625j;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f9625j.release();
            this.f9625j = null;
            G(0);
            if (z5) {
                this.i = 0;
            }
        }
    }

    public final boolean F() {
        int i;
        return (this.f9625j == null || (i = this.f9624h) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void G(int i) {
        fy fyVar = this.f10425c;
        dy dyVar = this.f9621e;
        if (i == 3) {
            dyVar.d();
            fyVar.f5503d = true;
            fyVar.a();
        } else if (this.f9624h == 3) {
            dyVar.f4735m = false;
            fyVar.f5503d = false;
            fyVar.a();
        }
        this.f9624h = i;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String d() {
        return "MediaPlayer".concat(true != this.f9631p ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void e(vx vxVar) {
        this.f9633r = vxVar;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void f(String str) {
        Uri uri = Uri.parse(str);
        li liVarA = li.a(uri);
        if (liVarA == null || liVarA.f7524b != null) {
            if (liVarA != null) {
                uri = Uri.parse(liVarA.f7524b);
            }
            this.f9626k = uri;
            this.f9632q = 0;
            D();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void g() {
        t9.c0.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f9625j;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f9625j.release();
            this.f9625j = null;
            G(0);
            this.i = 0;
        }
        this.f9621e.b();
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void h() {
        t9.c0.m("AdMediaPlayerView play");
        if (F()) {
            this.f9625j.start();
            G(3);
            this.f10424b.f12369c = true;
            t9.g0.f33596l.post(new ox(this, 3));
        }
        this.i = 3;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void i() {
        t9.c0.m("AdMediaPlayerView pause");
        if (F() && this.f9625j.isPlaying()) {
            this.f9625j.pause();
            G(4);
            t9.g0.f33596l.post(new ox(this, 4));
        }
        this.i = 4;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int j() {
        if (F()) {
            return this.f9625j.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int k() {
        if (F()) {
            return this.f9625j.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void l(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i);
        t9.c0.m(sb2.toString());
        if (!F()) {
            this.f9632q = i;
        } else {
            this.f9625j.seekTo(i);
            this.f9632q = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void m(float f10, float f11) {
        ay ayVar = this.f9630o;
        if (ayVar != null) {
            ayVar.c(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int n() {
        MediaPlayer mediaPlayer = this.f9625j;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final void o() {
        fy fyVar = this.f10425c;
        float f10 = fyVar.f5502c ? fyVar.f5504e ? 0.0f : fyVar.f5505f : 0.0f;
        MediaPlayer mediaPlayer = this.f9625j;
        if (mediaPlayer == null) {
            u9.i.h("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f9629n = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        t9.c0.m("AdMediaPlayerView completion");
        G(5);
        this.i = 5;
        t9.g0.f33596l.post(new ox(this, 0));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i10) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = f9619u;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i10));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer error: ");
        sb2.append(str);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(str2);
        u9.i.h(sb2.toString());
        G(-1);
        this.i = -1;
        t9.g0.f33596l.post(new d1(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i10) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = f9619u;
        String str = (String) map.get(numValueOf);
        String str2 = (String) map.get(Integer.valueOf(i10));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(str2);
        t9.c0.m(sb2.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f9627l
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f9628m
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f9627l
            if (r2 <= 0) goto L7a
            int r2 = r5.f9628m
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.ay r2 = r5.f9630o
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.f9627l
            int r1 = r0 * r7
            int r2 = r5.f9628m
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f9628m
            int r0 = r0 * r6
            int r2 = r5.f9627l
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f9627l
            int r1 = r1 * r7
            int r2 = r5.f9628m
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f9627l
            int r4 = r5.f9628m
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.ay r6 = r5.f9630o
            if (r6 == 0) goto L84
            r6.a(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qx.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        t9.c0.m("AdMediaPlayerView prepared");
        G(2);
        dy dyVar = this.f9621e;
        if (dyVar.i && !dyVar.f4732j) {
            c80.g(dyVar.f4728e, dyVar.f4727d, "vfr2");
            dyVar.f4732j = true;
        }
        t9.g0.f33596l.post(new l81(11, this, mediaPlayer, false));
        this.f9627l = mediaPlayer.getVideoWidth();
        this.f9628m = mediaPlayer.getVideoHeight();
        int i = this.f9632q;
        if (i != 0) {
            l(i);
        }
        if (this.f9622f && F() && this.f9625j.getCurrentPosition() > 0 && this.i != 3) {
            t9.c0.m("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.f9625j;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                u9.i.h("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f9625j.start();
            int currentPosition = this.f9625j.getCurrentPosition();
            p9.k.C.f31304k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (F() && this.f9625j.getCurrentPosition() == currentPosition) {
                p9.k.C.f31304k.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
                    break;
                }
            }
            this.f9625j.pause();
            o();
        }
        int i10 = this.f9627l;
        int i11 = this.f9628m;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        u9.i.g(sb2.toString());
        if (this.i == 3) {
            h();
        }
        o();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        t9.c0.m("AdMediaPlayerView surface created");
        D();
        t9.g0.f33596l.post(new ox(this, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t9.c0.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f9625j;
        if (mediaPlayer != null && this.f9632q == 0) {
            this.f9632q = mediaPlayer.getCurrentPosition();
        }
        ay ayVar = this.f9630o;
        if (ayVar != null) {
            ayVar.b();
        }
        t9.g0.f33596l.post(new ox(this, 2));
        E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        t9.c0.m("AdMediaPlayerView surface changed");
        int i11 = this.i;
        boolean z5 = false;
        if (this.f9627l == i && this.f9628m == i10) {
            z5 = true;
        }
        if (this.f9625j != null && i11 == 3 && z5) {
            int i12 = this.f9632q;
            if (i12 != 0) {
                l(i12);
            }
            h();
        }
        ay ayVar = this.f9630o;
        if (ayVar != null) {
            ayVar.a(i, i10);
        }
        t9.g0.f33596l.post(new px(this, i, i10, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f9621e.c(this);
        this.f10424b.a(surfaceTexture, this.f9633r);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 35 + String.valueOf(i10).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i);
        sb2.append(" x ");
        sb2.append(i10);
        t9.c0.m(sb2.toString());
        this.f9627l = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f9628m = videoHeight;
        if (this.f9627l == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i);
        t9.c0.m(sb2.toString());
        t9.g0.f33596l.post(new pf(this, i, 3));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int p() {
        MediaPlayer mediaPlayer = this.f9625j;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long q() {
        if (this.f9635t != null) {
            return (s() * ((long) this.f9629n)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long r() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final long s() {
        if (this.f9635t != null) {
            return ((long) j()) * ((long) this.f9635t.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final int t() {
        if (Build.VERSION.SDK_INT < 26 || !F()) {
            return -1;
        }
        return this.f9625j.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // android.view.View
    public final String toString() {
        String name = qx.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return t.z.g(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }
}
