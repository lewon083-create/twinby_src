package com.vk.sdk.api.groups.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsLongPollServer {

    @b("key")
    @NotNull
    private final String key;

    @b("server")
    @NotNull
    private final String server;

    @b("ts")
    @NotNull
    private final String ts;

    public GroupsLongPollServer(@NotNull String key, @NotNull String server, @NotNull String ts) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(ts, "ts");
        this.key = key;
        this.server = server;
        this.ts = ts;
    }

    public static /* synthetic */ GroupsLongPollServer copy$default(GroupsLongPollServer groupsLongPollServer, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupsLongPollServer.key;
        }
        if ((i & 2) != 0) {
            str2 = groupsLongPollServer.server;
        }
        if ((i & 4) != 0) {
            str3 = groupsLongPollServer.ts;
        }
        return groupsLongPollServer.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final String component2() {
        return this.server;
    }

    @NotNull
    public final String component3() {
        return this.ts;
    }

    @NotNull
    public final GroupsLongPollServer copy(@NotNull String key, @NotNull String server, @NotNull String ts) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(ts, "ts");
        return new GroupsLongPollServer(key, server, ts);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLongPollServer)) {
            return false;
        }
        GroupsLongPollServer groupsLongPollServer = (GroupsLongPollServer) obj;
        return Intrinsics.a(this.key, groupsLongPollServer.key) && Intrinsics.a(this.server, groupsLongPollServer.server) && Intrinsics.a(this.ts, groupsLongPollServer.ts);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getServer() {
        return this.server;
    }

    @NotNull
    public final String getTs() {
        return this.ts;
    }

    public int hashCode() {
        return this.ts.hashCode() + a.e(this.key.hashCode() * 31, 31, this.server);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        String str2 = this.server;
        return u.o(z.j("GroupsLongPollServer(key=", str, ", server=", str2, ", ts="), this.ts, ")");
    }
}
