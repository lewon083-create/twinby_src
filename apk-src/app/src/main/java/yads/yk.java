package yads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f45069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk f45070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xk f45071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pk f45072d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45074f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f45076h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f45075g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45073e = 0;

    public yk(Context context, Handler handler, xn0 xn0Var) {
        this.f45069a = (AudioManager) ni.a(context.getApplicationContext().getSystemService("audio"));
        this.f45071c = xn0Var;
        this.f45070b = new wk(this, handler);
    }

    public final void a() {
        if (this.f45073e == 0) {
            return;
        }
        if (lb3.f40466a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f45076h;
            if (audioFocusRequest != null) {
                this.f45069a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f45069a.abandonAudioFocus(this.f45070b);
        }
        b(0);
    }

    public final void b() {
        if (lb3.a(this.f45072d, (Object) null)) {
            return;
        }
        this.f45072d = null;
        this.f45074f = 0;
    }

    public final void b(int i) {
        if (this.f45073e == i) {
            return;
        }
        this.f45073e = i;
        float f10 = i == 3 ? 0.2f : 1.0f;
        if (this.f45075g == f10) {
            return;
        }
        this.f45075g = f10;
        xk xkVar = this.f45071c;
        if (xkVar != null) {
            ao0 ao0Var = ((xn0) xkVar).f44771a;
            ao0Var.a(1, 2, Float.valueOf(ao0Var.T * ao0Var.f36816v.f45075g));
        }
    }

    public final void a(int i) {
        xk xkVar = this.f45071c;
        if (xkVar != null) {
            xn0 xn0Var = (xn0) xkVar;
            ao0 ao0Var = xn0Var.f44771a;
            ao0Var.r();
            boolean z5 = ao0Var.Z.f38105l;
            ao0 ao0Var2 = xn0Var.f44771a;
            int i10 = 1;
            if (z5 && i != 1) {
                i10 = 2;
            }
            ao0Var2.a(i, i10, z5);
        }
    }

    public final int a(boolean z5, int i) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderF;
        if (i == 1 || this.f45074f != 1) {
            a();
            return z5 ? 1 : -1;
        }
        if (z5) {
            if (this.f45073e != 1) {
                if (lb3.f40466a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f45076h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            wd.g.i();
                            builderF = io.sentry.android.core.o.f(this.f45074f);
                        } else {
                            wd.g.i();
                            builderF = wd.g.f(this.f45076h);
                        }
                        pk pkVar = this.f45072d;
                        boolean z10 = pkVar != null && pkVar.f41938b == 1;
                        pkVar.getClass();
                        if (pkVar.f41943g == null) {
                            pkVar.f41943g = new ok(pkVar);
                        }
                        this.f45076h = builderF.setAudioAttributes(pkVar.f41943g.f41551a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(this.f45070b).build();
                    }
                    iRequestAudioFocus = this.f45069a.requestAudioFocus(this.f45076h);
                } else {
                    AudioManager audioManager = this.f45069a;
                    wk wkVar = this.f45070b;
                    pk pkVar2 = this.f45072d;
                    pkVar2.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(wkVar, lb3.c(pkVar2.f41940d), this.f45074f);
                }
                if (iRequestAudioFocus == 1) {
                    b(1);
                    return 1;
                }
                b(0);
                return -1;
            }
        }
    }
}
