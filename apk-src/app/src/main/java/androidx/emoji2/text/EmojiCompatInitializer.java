package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import s6.a;
import s6.b;
import u2.h;
import u2.i;
import u2.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // s6.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // s6.b
    public final Object create(Context context) {
        Object objB;
        m mVar = new m(new ti.m(context));
        mVar.f34054b = 1;
        if (h.f34028j == null) {
            synchronized (h.i) {
                try {
                    if (h.f34028j == null) {
                        h.f34028j = new h(mVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f32780e) {
            try {
                objB = aVarC.f32781a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        p lifecycle = ((u) objB).getLifecycle();
        lifecycle.a(new i(this, lifecycle));
        return Boolean.TRUE;
    }
}
