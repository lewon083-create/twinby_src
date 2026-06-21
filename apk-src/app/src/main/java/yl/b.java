package yl;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKPreferencesKeyValueStorage;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKScope;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.account.AccountService;
import com.vk.sdk.api.users.UsersService;
import hi.g;
import ii.n;
import ii.o;
import ii.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import ti.t0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f45755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f45756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f45757d;

    public b(Context context, t0 loginCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loginCallback, "loginCallback");
        this.f45755b = context;
        this.f45756c = loginCallback;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = str.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            arrayList.add(VKScope.valueOf(upperCase));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ii.o
    public final void onMethodCall(n call, p result) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "r");
        if (this.f45757d != null) {
            String str = call.f21315a;
            int iHashCode = str.hashCode();
            HashMap mapB = null;
            Context context = this.f45755b;
            switch (iHashCode) {
                case -1682957889:
                    if (str.equals("getAccessToken")) {
                        if (VK.isLoggedIn()) {
                            VKAccessToken vKAccessTokenRestore = VKAccessToken.Companion.restore(new VKPreferencesKeyValueStorage(context, null, 2, null));
                            if (vKAccessTokenRestore != null) {
                                mapB = a.a.b(vKAccessTokenRestore);
                            }
                        }
                        ((g) result).success(mapB);
                        return;
                    }
                    break;
                case -1251560920:
                    if (str.equals("getUserProfile")) {
                        VKRequest vKRequestUsersGet$default = UsersService.usersGet$default(new UsersService(), null, c.f45758a, null, 5, null);
                        g8.b bVar = new g8.b();
                        bVar.f20008b = (g) result;
                        VK.execute(vKRequestUsersGet$default, bVar);
                        return;
                    }
                    break;
                case -1097360022:
                    if (str.equals("logOut")) {
                        VK.logout();
                        ((g) result).success(null);
                        return;
                    }
                    break;
                case 103148425:
                    if (str.equals("logIn")) {
                        Collection collection = (List) call.a("scope");
                        if (collection == null) {
                            collection = b0.f27475b;
                        }
                        Intrinsics.checkNotNullParameter(result, "result");
                        t0 t0Var = this.f45756c;
                        if (t0Var.f33898b != null) {
                            Intrinsics.checkNotNullParameter("Interrupted by another login call", "message");
                            Intrinsics.checkNotNullParameter("INTERRUPTED", "code");
                            g gVar = t0Var.f33898b;
                            if (gVar != null) {
                                gVar.b("INTERRUPTED", "Interrupted by another login call", null);
                            }
                            t0Var.f33898b = null;
                        }
                        t0Var.f33898b = (g) result;
                        String[] strArr = (String[]) collection.toArray(new String[0]);
                        ArrayList arrayListA = a(s.f(Arrays.copyOf(strArr, strArr.length)));
                        Activity activity = this.f45757d;
                        Intrinsics.b(activity);
                        VK.login(activity, arrayListA);
                        return;
                    }
                    break;
                case 1948321034:
                    if (str.equals("initSdk")) {
                        List list = (List) call.a("scope");
                        VK.initialize(context);
                        if (list == null || !VK.isLoggedIn()) {
                            ((g) result).success(Boolean.TRUE);
                            return;
                        } else {
                            VK.execute(new AccountService().accountGetAppPermissions(VK.getUserId()), new v(list, this, (g) result));
                            return;
                        }
                    }
                    break;
                case 2034588468:
                    if (str.equals("getSdkVersion")) {
                        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                        ((g) result).success(String.valueOf(applicationInfo.metaData.get("VKSdkVersion")));
                        return;
                    }
                    break;
            }
            ((g) result).a();
        }
    }
}
