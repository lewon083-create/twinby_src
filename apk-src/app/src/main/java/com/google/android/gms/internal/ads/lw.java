package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.lw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f7654a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7656c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler.Callback f7659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f7660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f7661h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f7657d = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7655b = 0;

    public lw(Context context, Looper looper, ut1 ut1Var) {
        this.f7658e = vv.c(new zk(context, 1));
        this.f7659f = ut1Var;
        this.f7654a = new Handler(looper);
    }

    public void a() {
        int i = this.f7655b;
        if (i == 1 || i == 0 || ((k3.e) this.f7661h) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) ((zc.p) this.f7658e).get();
        k3.e eVar = (k3.e) this.f7661h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(eVar.f26849b);
            return;
        }
        Object obj = eVar.f26853f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(io.sentry.android.core.o.k(obj));
    }

    public void b(int i) {
        s3.e0 e0Var = (s3.e0) this.f7659f;
        if (e0Var != null) {
            m3.v vVar = e0Var.i;
            vVar.getClass();
            m3.u uVarB = m3.v.b();
            uVarB.f28599a = vVar.f28601a.obtainMessage(33, i, 0);
            uVarB.b();
        }
    }

    public void c(int i) {
        if (this.f7655b == i) {
            return;
        }
        this.f7655b = i;
        float f10 = i == 4 ? 0.2f : 1.0f;
        if (this.f7657d == f10) {
            return;
        }
        this.f7657d = f10;
        s3.e0 e0Var = (s3.e0) this.f7659f;
        if (e0Var != null) {
            e0Var.i.e(34);
        }
    }

    public int d(int i, boolean z5) {
        int i10;
        int iRequestAudioFocus;
        d8.h hVar;
        boolean z10 = false;
        if (i == 1 || (i10 = this.f7656c) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z5) {
            int i11 = this.f7655b;
            if (i11 == 1) {
                return -1;
            }
            if (i11 == 3) {
                return 0;
            }
        } else if (this.f7655b != 2) {
            k3.e eVar = (k3.e) this.f7661h;
            if (eVar == null) {
                if (eVar == null) {
                    hVar = new d8.h();
                    hVar.f15630c = j3.d.f26224c;
                    hVar.f15628a = i10;
                } else {
                    d8.h hVar2 = new d8.h();
                    hVar2.f15628a = eVar.f26848a;
                    hVar2.f15630c = eVar.f26851d;
                    hVar2.f15629b = eVar.f26852e;
                    hVar = hVar2;
                }
                j3.d dVar = (j3.d) this.f7660g;
                if (dVar != null && dVar.f26225a == 1) {
                    z10 = true;
                }
                dVar.getClass();
                hVar.f15630c = dVar;
                hVar.f15629b = z10;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: k3.b
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i12) {
                        j3.d dVar2;
                        lw lwVar = this.f26843a;
                        lwVar.getClass();
                        if (i12 == -3 || i12 == -2) {
                            if (i12 != -2 && ((dVar2 = (j3.d) lwVar.f7660g) == null || dVar2.f26225a != 1)) {
                                lwVar.c(4);
                                return;
                            } else {
                                lwVar.b(0);
                                lwVar.c(3);
                                return;
                            }
                        }
                        if (i12 == -1) {
                            lwVar.b(-1);
                            lwVar.a();
                            lwVar.c(1);
                        } else if (i12 != 1) {
                            gf.a.p(i12, "Unknown focus change type: ", "AudioFocusManager");
                        } else {
                            lwVar.c(2);
                            lwVar.b(1);
                        }
                    }
                };
                Handler handler = this.f7654a;
                handler.getClass();
                this.f7661h = new k3.e(hVar.f15628a, onAudioFocusChangeListener, handler, (j3.d) hVar.f15630c, hVar.f15629b);
            }
            AudioManager audioManager = (AudioManager) ((zc.p) this.f7658e).get();
            k3.e eVar2 = (k3.e) this.f7661h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = eVar2.f26853f;
                obj.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(io.sentry.android.core.o.k(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = eVar2.f26849b;
                eVar2.f26851d.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, 3, eVar2.f26848a);
            }
            if (iRequestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }

    public void e(s50 s50Var) {
        if (Objects.equals((s50) this.f7660g, s50Var)) {
            return;
        }
        this.f7660g = s50Var;
        this.f7656c = s50Var == null ? 0 : 1;
    }

    public int f(int i, boolean z5) {
        int iRequestAudioFocus;
        if (i == 1 || this.f7656c != 1) {
            h();
            i(0);
            return 1;
        }
        if (!z5) {
            int i10 = this.f7655b;
            if (i10 == 1) {
                return -1;
            }
            if (i10 == 3) {
                return 0;
            }
        } else if (this.f7655b != 2) {
            if (((my) this.f7661h) == null) {
                s50 s50Var = s50.f10178b;
                s50 s50Var2 = (s50) this.f7660g;
                s50Var2.getClass();
                pu puVar = new pu(this);
                Handler handler = this.f7654a;
                handler.getClass();
                this.f7661h = new my(puVar, handler, s50Var2);
            }
            AudioManager audioManager = (AudioManager) ((o31) this.f7658e).mo8h();
            my myVar = (my) this.f7661h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = myVar.f8037d;
                obj.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(io.sentry.android.core.o.k(obj));
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(myVar.f8034a, 3, 1);
            }
            if (iRequestAudioFocus == 1) {
                i(2);
                return 1;
            }
            i(1);
            return -1;
        }
        return 1;
    }

    public void g() {
        this.f7659f = null;
        h();
        i(0);
    }

    public void h() {
        int i = this.f7655b;
        if (i == 1 || i == 0 || ((my) this.f7661h) == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) ((o31) this.f7658e).mo8h();
        my myVar = (my) this.f7661h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(myVar.f8034a);
            return;
        }
        Object obj = myVar.f8037d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(io.sentry.android.core.o.k(obj));
    }

    public void i(int i) {
        if (this.f7655b == i) {
            return;
        }
        this.f7655b = i;
        float f10 = i == 4 ? 0.2f : 1.0f;
        if (this.f7657d != f10) {
            this.f7657d = f10;
            ut1 ut1Var = (ut1) this.f7659f;
            if (ut1Var != null) {
                ut1Var.i.c(34);
            }
        }
    }

    public void j(int i) {
        ut1 ut1Var = (ut1) this.f7659f;
        if (ut1Var != null) {
            Handler handler = ut1Var.i.f7588a;
            go0 go0VarG = lo0.g();
            go0VarG.f5884a = handler.obtainMessage(33, i, 0);
            go0VarG.a();
        }
    }

    public lw(Context context, Looper looper, s3.e0 e0Var) {
        this.f7658e = hl.l.m(new k3.c(context, 0));
        this.f7659f = e0Var;
        this.f7654a = new Handler(looper);
    }
}
