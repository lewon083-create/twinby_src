package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 implements d6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i5 f14117b = new i5(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14118a;

    public /* synthetic */ z5(Object obj) {
        this.f14118a = obj;
    }

    public Object a() {
        g4 g4Var = (g4) this.f14118a;
        ContentResolver contentResolver = g4Var.f13755a;
        Uri uri = g4Var.f13756b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, g4.f13754j, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map eVar = count <= 256 ? new h1.e(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return eVar;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e3) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e3);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    public void b(int i, Object obj, m6 m6Var) throws androidx.datastore.preferences.protobuf.m {
        t4 t4Var = (t4) obj;
        a5 a5Var = (a5) this.f14118a;
        a5Var.G((i << 3) | 2);
        a5Var.G(t4Var.b(m6Var));
        m6Var.d(t4Var, a5Var.f13654c);
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public boolean c(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((d6[]) this.f14118a)[i].c(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public l6 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            d6 d6Var = ((d6[]) this.f14118a)[i];
            if (d6Var.c(cls)) {
                return d6Var.d(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public void e(int i, Object obj, m6 m6Var) throws androidx.datastore.preferences.protobuf.m {
        a5 a5Var = (a5) this.f14118a;
        a5Var.w(i, 3);
        m6Var.d((t4) obj, a5Var.f13654c);
        a5Var.w(i, 4);
    }

    public z5(int i) {
        switch (i) {
            case 1:
                this.f14118a = new HashMap();
                break;
            default:
                j6 j6Var = j6.f13841c;
                z5 z5Var = new z5(new d6[]{i5.f13784b, f14117b});
                Charset charset = r5.f13944a;
                this.f14118a = z5Var;
                break;
        }
    }

    public z5(a5 a5Var) {
        Charset charset = r5.f13944a;
        this.f14118a = a5Var;
        a5Var.f13654c = this;
    }
}
