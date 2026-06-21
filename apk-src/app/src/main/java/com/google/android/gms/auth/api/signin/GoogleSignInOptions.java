package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ic.l;
import j0.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import na.b;
import org.json.JSONArray;
import org.json.JSONObject;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f2599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f2600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f2601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope f2602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Scope f2603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Scope f2604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f2605r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f2608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2612h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2614k;

    static {
        Scope scope = new Scope(1, "profile");
        f2601n = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f2602o = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f2603p = scope3;
        f2604q = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f2604q)) {
            Scope scope4 = f2603p;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f2599l = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f2604q)) {
            Scope scope5 = f2603p;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        f2600m = new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new com.google.android.material.datepicker.a(15);
        f2605r = new l(2);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z5, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f2606b = i;
        this.f2607c = arrayList;
        this.f2608d = account;
        this.f2609e = z5;
        this.f2610f = z10;
        this.f2611g = z11;
        this.f2612h = str;
        this.i = str2;
        this.f2613j = new ArrayList(map.values());
        this.f2614k = str3;
    }

    public static GoogleSignInOptions a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ka.a aVar = (ka.a) it.next();
                map.put(Integer.valueOf(aVar.f27298c), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f2612h;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f2607c;
            String str2 = googleSignInOptions.f2612h;
            Account account = googleSignInOptions.f2608d;
            if (this.f2613j.isEmpty() && googleSignInOptions.f2613j.isEmpty()) {
                ArrayList arrayList2 = this.f2607c;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.f2608d;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.f2611g == googleSignInOptions.f2611g && this.f2609e == googleSignInOptions.f2609e && this.f2610f == googleSignInOptions.f2610f) {
                        return TextUtils.equals(this.f2614k, googleSignInOptions.f2614k);
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2607c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).f2628c);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f2608d;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f2612h;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f2611g ? 1 : 0)) * 31) + (this.f2609e ? 1 : 0)) * 31) + (this.f2610f ? 1 : 0)) * 31;
        String str2 = this.f2614k;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.h0(parcel, 1, 4);
        parcel.writeInt(this.f2606b);
        g.f0(parcel, 2, new ArrayList(this.f2607c));
        g.a0(parcel, 3, this.f2608d, i);
        g.h0(parcel, 4, 4);
        parcel.writeInt(this.f2609e ? 1 : 0);
        g.h0(parcel, 5, 4);
        parcel.writeInt(this.f2610f ? 1 : 0);
        g.h0(parcel, 6, 4);
        parcel.writeInt(this.f2611g ? 1 : 0);
        g.b0(parcel, 7, this.f2612h);
        g.b0(parcel, 8, this.i);
        g.f0(parcel, 9, this.f2613j);
        g.b0(parcel, 10, this.f2614k);
        g.m0(parcel, iI0);
    }
}
