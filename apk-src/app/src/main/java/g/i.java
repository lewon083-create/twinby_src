package g;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.util.Log;
import f.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.p;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import z2.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19502a;

    public /* synthetic */ i(int i) {
        this.f19502a = i;
    }

    public Intent a(Context context, j input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(j0.g.P(input.f16472a));
            input.f16474c.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (j0.g.O(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(j0.g.P(input.f16472a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoO = j0.g.O(context);
        if (resolveInfoO == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoO.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(j0.g.P(input.f16472a));
        input.f16474c.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // g.b
    public final Intent createIntent(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f19502a) {
            case 0:
                return a(context, (j) obj);
            case 1:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(input, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 2:
                Intent input2 = (Intent) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input2, "input");
                return input2;
            case 3:
                f.i input3 = (f.i) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input3);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            default:
                f.i iVar = (f.i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = iVar.f16469c;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = iVar.f16468b;
                        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                        iVar = new f.i(intentSender, null, iVar.f16470d, iVar.f16471e);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (h0.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // g.b
    public a getSynchronousResult(Context context, Object obj) {
        switch (this.f19502a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter((j) obj, "input");
                return null;
            case 1:
                String[] input = (String[]) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (input.length == 0) {
                    return new a(j0.d());
                }
                for (String str : input) {
                    if (t1.b.a(context, str) != 0) {
                        return null;
                    }
                }
                int iB = i0.b(input.length);
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new a(linkedHashMap);
            default:
                return super.getSynchronousResult(context, obj);
        }
    }

    @Override // g.b
    public final Object parseResult(int i, Intent intent) {
        List arrayList;
        switch (this.f19502a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        Intrinsics.checkNotNullParameter(intent, "<this>");
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Uri data2 = intent.getData();
                        if (data2 != null) {
                            linkedHashSet.add(data2);
                        }
                        ClipData clipData = intent.getClipData();
                        if (clipData == null && linkedHashSet.isEmpty()) {
                            arrayList = b0.f27475b;
                        } else {
                            if (clipData != null) {
                                int itemCount = clipData.getItemCount();
                                for (int i10 = 0; i10 < itemCount; i10++) {
                                    Uri uri = clipData.getItemAt(i10).getUri();
                                    if (uri != null) {
                                        linkedHashSet.add(uri);
                                    }
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                    }
                }
                break;
            case 1:
                if (i == -1) {
                    if (intent != null) {
                        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                        if (intArrayExtra != null && stringArrayExtra != null) {
                            ArrayList other = new ArrayList(intArrayExtra.length);
                            for (int i11 : intArrayExtra) {
                                other.add(Boolean.valueOf(i11 == 0));
                            }
                            ArrayList arrayListL = p.l(stringArrayExtra);
                            Intrinsics.checkNotNullParameter(arrayListL, "<this>");
                            Intrinsics.checkNotNullParameter(other, "other");
                            Iterator it = arrayListL.iterator();
                            Iterator it2 = other.iterator();
                            ArrayList arrayList2 = new ArrayList(Math.min(t.j(arrayListL, 10), t.j(other, 10)));
                            while (it.hasNext() && it2.hasNext()) {
                                arrayList2.add(new Pair(it.next(), it2.next()));
                            }
                        }
                    }
                }
                break;
        }
        return new f.a(i, intent);
    }
}
