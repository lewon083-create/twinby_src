package com.vk.api.sdk.auth;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKAuthParams {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_REDIRECT_URL = "https://oauth.vk.com/blank.html";
    private static final String VK_APP_ID_KEY = "vk_app_id";
    private static final String VK_APP_REDIRECT_URL_KEY = "vk_app_redirect_url";
    private static final String VK_APP_SCOPE_KEY = "vk_app_scope";
    private static final String VK_EXTRA_CLIENT_ID = "client_id";
    private static final String VK_EXTRA_REDIRECT_URL = "redirect_url";
    private static final String VK_EXTRA_REVOKE = "revoke";
    private static final String VK_EXTRA_SCOPE = "scope";
    private final int appId;
    private final String redirectUrl;
    private final Set<VKScope> scope;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VKAuthParams fromBundle(Bundle bundle) {
            Collection arrayList = null;
            if (bundle == null) {
                return null;
            }
            int i = bundle.getInt(VKAuthParams.VK_APP_ID_KEY);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(VKAuthParams.VK_APP_SCOPE_KEY);
            if (stringArrayList != null) {
                arrayList = new ArrayList(t.j(stringArrayList, 10));
                for (String it : stringArrayList) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(VKScope.valueOf(it));
                }
            }
            if (arrayList == null) {
                arrayList = d0.f27478b;
            }
            String redirectUrl = bundle.getString(VKAuthParams.VK_APP_REDIRECT_URL_KEY, VKAuthParams.DEFAULT_REDIRECT_URL);
            Intrinsics.checkNotNullExpressionValue(redirectUrl, "redirectUrl");
            return new VKAuthParams(i, redirectUrl, arrayList);
        }

        private Companion() {
        }
    }

    public VKAuthParams(int i) {
        this(i, null, null, 6, null);
    }

    public final int getAppId() {
        return this.appId;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getScopeString() {
        return CollectionsKt.I(this.scope, StringUtils.COMMA, null, null, null, 62);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(VK_APP_ID_KEY, this.appId);
        Set<VKScope> set = this.scope;
        ArrayList arrayList = new ArrayList(t.j(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((VKScope) it.next()).name());
        }
        bundle.putStringArrayList(VK_APP_SCOPE_KEY, new ArrayList<>(arrayList));
        bundle.putString(VK_APP_REDIRECT_URL_KEY, this.redirectUrl);
        return bundle;
    }

    public final Bundle toExtraBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(VK_EXTRA_CLIENT_ID, this.appId);
        bundle.putBoolean(VK_EXTRA_REVOKE, true);
        bundle.putString(VK_EXTRA_SCOPE, CollectionsKt.I(this.scope, StringUtils.COMMA, null, null, null, 62));
        bundle.putString(VK_EXTRA_REDIRECT_URL, this.redirectUrl);
        return bundle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKAuthParams(int i, String redirectUrl) {
        this(i, redirectUrl, null, 4, null);
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
    }

    public VKAuthParams(int i, String redirectUrl, Collection<? extends VKScope> scope) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.appId = i;
        this.redirectUrl = redirectUrl;
        if (i != 0) {
            this.scope = new HashSet(scope);
            return;
        }
        throw new IllegalStateException("AppId is empty! Find out how to get your appId at https://vk.com/dev/access_token");
    }

    public VKAuthParams(int i, String str, Collection collection, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? DEFAULT_REDIRECT_URL : str, (i10 & 4) != 0 ? d0.f27478b : collection);
    }
}
