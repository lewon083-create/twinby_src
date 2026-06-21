package com.vk.sdk.api;

import com.google.gson.internal.bind.p;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.newsfeed.dto.NewsfeedNewsfeedItem;
import com.vk.sdk.api.users.dto.UsersSubscriptionsItem;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;
import me.a;
import me.k;
import me.l;

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
public final class GsonHolder$gson$2 extends r implements Function0<k> {
    public static final GsonHolder$gson$2 INSTANCE = new GsonHolder$gson$2();

    public GsonHolder$gson$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final k invoke() {
        int i;
        l lVar = new l();
        lVar.a(UsersSubscriptionsItem.class, new UsersSubscriptionsItem.Deserializer());
        lVar.a(NewsfeedNewsfeedItem.class, new NewsfeedNewsfeedItem.Deserializer());
        lVar.a(UserId.class, new UserId.GsonSerializer(false));
        lVar.a(Boolean.class, new GsonHolder.BooleanGsonSerializer());
        lVar.a(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer());
        ArrayList arrayList = lVar.f28889e;
        int size = arrayList.size();
        ArrayList arrayList2 = lVar.f28890f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        int i10 = lVar.f28891g;
        if (i10 != 2 && (i = lVar.f28892h) != 2) {
            a aVar = new a(i10, i, Date.class);
            a aVar2 = new a(i10, i, Timestamp.class);
            a aVar3 = new a(i10, i, java.sql.Date.class);
            arrayList3.add(p.c(Date.class, aVar));
            arrayList3.add(p.c(Timestamp.class, aVar2));
            arrayList3.add(p.c(java.sql.Date.class, aVar3));
        }
        return new k(lVar.f28885a, lVar.f28887c, lVar.f28888d, lVar.i, lVar.f28886b, arrayList3);
    }
}
