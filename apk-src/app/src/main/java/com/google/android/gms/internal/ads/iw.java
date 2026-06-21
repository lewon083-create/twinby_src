package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6625a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6626b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90 f6628d;

    public iw(Context context, n90 n90Var) {
        this.f6627c = context;
        this.f6628d = n90Var;
    }

    public final synchronized void a(String str) {
        try {
            HashMap map = this.f6625a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f6627c) : this.f6627c.getSharedPreferences(str, 0);
            gw gwVar = new gw(this, str);
            map.put(str, gwVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(gwVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
