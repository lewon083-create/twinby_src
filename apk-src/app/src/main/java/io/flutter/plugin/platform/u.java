package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f25755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f25756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f25757c;

    public u(Context context, c0 c0Var, Context context2) {
        super(context);
        this.f25755a = c0Var;
        this.f25757c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length && i < 11; i++) {
            if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                return this.f25757c.getSystemService(str);
            }
        }
        if (this.f25756b == null) {
            this.f25756b = this.f25755a;
        }
        return this.f25756b;
    }
}
