package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.lt;
import q9.c;
import q9.o;
import q9.r;
import u9.i;
import xa.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lt f2526b;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.s1(i, i10, intent);
            }
        } catch (Exception e3) {
            i.k("#007 Could not call remote method.", e3);
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                if (!ltVar.k()) {
                    return;
                }
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
        super.onBackPressed();
        try {
            lt ltVar2 = this.f2526b;
            if (ltVar2 != null) {
                ltVar2.i();
            }
        } catch (RemoteException e7) {
            i.k("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.L(new b(configuration));
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.c("AdActivity onCreate");
        o oVar = r.f31959g.f31961b;
        oVar.getClass();
        c cVar = new c(oVar, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            i.e("useClientJar flag not found in activity intent extras.");
        }
        lt ltVar = (lt) cVar.d(this, booleanExtra);
        this.f2526b = ltVar;
        if (ltVar == null) {
            i.k("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            ltVar.T3(bundle);
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i.c("AdActivity onDestroy");
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.y();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        i.c("AdActivity onPause");
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.e();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.k1(i, strArr, iArr);
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        i.c("AdActivity onRestart");
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.f();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        i.c("AdActivity onResume");
        super.onResume();
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.n();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.W(bundle);
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        i.c("AdActivity onStart");
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.d();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        i.c("AdActivity onStop");
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.K();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            lt ltVar = this.f2526b;
            if (ltVar != null) {
                ltVar.c();
            }
        } catch (RemoteException e3) {
            i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        lt ltVar = this.f2526b;
        if (ltVar != null) {
            try {
                ltVar.v();
            } catch (RemoteException e3) {
                i.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        lt ltVar = this.f2526b;
        if (ltVar != null) {
            try {
                ltVar.v();
            } catch (RemoteException e3) {
                i.k("#007 Could not call remote method.", e3);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        lt ltVar = this.f2526b;
        if (ltVar != null) {
            try {
                ltVar.v();
            } catch (RemoteException e3) {
                i.k("#007 Could not call remote method.", e3);
            }
        }
    }
}
