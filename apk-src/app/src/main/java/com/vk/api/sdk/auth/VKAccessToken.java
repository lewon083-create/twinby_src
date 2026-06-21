package com.vk.api.sdk.auth;

import android.os.Bundle;
import com.vk.api.sdk.VKKeyValueStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.id.UserIdKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.s;
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
public final class VKAccessToken {
    private static final String ACCESS_TOKEN = "access_token";
    private static final String EMAIL = "email";
    private static final String PHONE = "phone";
    private static final String USER_ID = "user_id";
    private final String accessToken;
    private final long created;
    private final String email;
    private final long expirationDate;
    private final boolean httpsRequired;
    private final String phone;
    private final String phoneAccessKey;
    private final String secret;
    private final UserId userId;
    public static final Companion Companion = new Companion(null);
    private static final String EXPIRES_IN = "expires_in";
    private static final String SECRET = "secret";
    private static final String HTTPS_REQUIRED = "https_required";
    private static final String CREATED = "created";
    private static final String VK_ACCESS_TOKEN_KEY = "vk_access_token";
    private static final String PHONE_ACCESS_KEY = "phone_access_key";
    private static final List<String> KEYS = s.f("access_token", EXPIRES_IN, "user_id", SECRET, HTTPS_REQUIRED, CREATED, VK_ACCESS_TOKEN_KEY, "email", "phone", PHONE_ACCESS_KEY);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getKEYS() {
            return VKAccessToken.KEYS;
        }

        public final void remove(VKKeyValueStorage keyValueStorage) {
            Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
            Iterator<T> it = getKEYS().iterator();
            while (it.hasNext()) {
                keyValueStorage.remove((String) it.next());
            }
        }

        public final VKAccessToken restore(Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || (bundle2 = bundle.getBundle(VKAccessToken.VK_ACCESS_TOKEN_KEY)) == null) {
                return null;
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map.put(key, bundle2.getString(key));
            }
            return new VKAccessToken(map);
        }

        private Companion() {
        }

        public final VKAccessToken restore(VKKeyValueStorage keyValueStorage) {
            Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
            HashMap map = new HashMap(getKEYS().size());
            for (String str : getKEYS()) {
                String str2 = keyValueStorage.get(str);
                if (str2 != null) {
                    map.put(str, str2);
                }
            }
            if (map.containsKey("access_token") && map.containsKey("user_id")) {
                return new VKAccessToken(map);
            }
            return null;
        }
    }

    public VKAccessToken(Map<String, String> params) {
        long jCurrentTimeMillis;
        long j10;
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.get("user_id");
        UserId userId = str == null ? null : UserIdKt.toUserId(Long.parseLong(str));
        Intrinsics.b(userId);
        this.userId = userId;
        String str2 = params.get("access_token");
        Intrinsics.b(str2);
        this.accessToken = str2;
        this.secret = params.get(SECRET);
        this.httpsRequired = "1".equals(params.get(HTTPS_REQUIRED));
        if (params.containsKey(CREATED)) {
            String str3 = params.get(CREATED);
            Intrinsics.b(str3);
            jCurrentTimeMillis = Long.parseLong(str3);
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.created = jCurrentTimeMillis;
        if (params.containsKey(EXPIRES_IN)) {
            String str4 = params.get(EXPIRES_IN);
            Intrinsics.b(str4);
            j10 = Long.parseLong(str4);
        } else {
            j10 = -1;
        }
        this.expirationDate = j10;
        this.email = params.containsKey("email") ? params.get("email") : null;
        this.phone = params.containsKey("phone") ? params.get("phone") : null;
        this.phoneAccessKey = params.containsKey(PHONE_ACCESS_KEY) ? params.get(PHONE_ACCESS_KEY) : null;
    }

    private final Map<String, String> toMap() {
        HashMap map = new HashMap();
        map.put("access_token", this.accessToken);
        map.put(SECRET, this.secret);
        map.put(HTTPS_REQUIRED, this.httpsRequired ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        map.put(CREATED, String.valueOf(this.created));
        map.put(EXPIRES_IN, String.valueOf(this.expirationDate));
        map.put("user_id", this.userId.toString());
        map.put("email", this.email);
        map.put("phone", this.phone);
        map.put(PHONE_ACCESS_KEY, this.phoneAccessKey);
        return map;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getCreated() {
        return this.created;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneAccessKey() {
        return this.phoneAccessKey;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final boolean isValid() {
        long j10 = this.expirationDate;
        if (j10 > 0) {
            return (j10 * ((long) 1000)) + this.created > System.currentTimeMillis();
        }
        return true;
    }

    public final void save(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, String> entry : toMap().entrySet()) {
            bundle2.putString(entry.getKey(), entry.getValue());
        }
        bundle.putBundle(VK_ACCESS_TOKEN_KEY, bundle2);
    }

    public final void save(VKKeyValueStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        for (Map.Entry<String, String> entry : toMap().entrySet()) {
            storage.putOrRemove(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKAccessToken(UserId userId, String accessToken, String str) {
        this(j0.g(new Pair("user_id", userId.toString()), new Pair("access_token", accessToken), new Pair(SECRET, str), new Pair(HTTPS_REQUIRED, "1")));
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }
}
