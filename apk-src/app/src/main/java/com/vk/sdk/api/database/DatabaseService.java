package com.vk.sdk.api.database;

import com.google.gson.reflect.a;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.base.dto.BaseCountry;
import com.vk.sdk.api.database.dto.DatabaseCityById;
import com.vk.sdk.api.database.dto.DatabaseGetChairsResponse;
import com.vk.sdk.api.database.dto.DatabaseGetCitiesResponse;
import com.vk.sdk.api.database.dto.DatabaseGetCountriesResponse;
import com.vk.sdk.api.database.dto.DatabaseGetFacultiesResponse;
import com.vk.sdk.api.database.dto.DatabaseGetMetroStationsResponse;
import com.vk.sdk.api.database.dto.DatabaseGetRegionsResponse;
import com.vk.sdk.api.database.dto.DatabaseGetSchoolsResponse;
import com.vk.sdk.api.database.dto.DatabaseGetUniversitiesResponse;
import com.vk.sdk.api.database.dto.DatabaseStation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
import ni.v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public final class DatabaseService {
    public static /* synthetic */ VKRequest databaseGetChairs$default(DatabaseService databaseService, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return databaseService.databaseGetChairs(i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetChairs$lambda-0, reason: not valid java name */
    public static final DatabaseGetChairsResponse m137databaseGetChairs$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetChairsResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetChairsResponse.class);
    }

    public static /* synthetic */ VKRequest databaseGetCities$default(DatabaseService databaseService, int i, Integer num, String str, Boolean bool, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            num3 = null;
        }
        return databaseService.databaseGetCities(i, num, str, bool, num2, num3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetCities$lambda-4, reason: not valid java name */
    public static final DatabaseGetCitiesResponse m138databaseGetCities$lambda4(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetCitiesResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetCitiesResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest databaseGetCitiesById$default(DatabaseService databaseService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return databaseService.databaseGetCitiesById(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetCitiesById$lambda-11, reason: not valid java name */
    public static final List m139databaseGetCitiesById$lambda11(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends DatabaseCityById>>() { // from class: com.vk.sdk.api.database.DatabaseService$databaseGetCitiesById$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest databaseGetCountries$default(DatabaseService databaseService, Boolean bool, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return databaseService.databaseGetCountries(bool, str, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetCountries$lambda-14, reason: not valid java name */
    public static final DatabaseGetCountriesResponse m140databaseGetCountries$lambda14(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetCountriesResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetCountriesResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest databaseGetCountriesById$default(DatabaseService databaseService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return databaseService.databaseGetCountriesById(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetCountriesById$lambda-20, reason: not valid java name */
    public static final List m141databaseGetCountriesById$lambda20(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends BaseCountry>>() { // from class: com.vk.sdk.api.database.DatabaseService$databaseGetCountriesById$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest databaseGetFaculties$default(DatabaseService databaseService, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return databaseService.databaseGetFaculties(i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetFaculties$lambda-23, reason: not valid java name */
    public static final DatabaseGetFacultiesResponse m142databaseGetFaculties$lambda23(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetFacultiesResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetFacultiesResponse.class);
    }

    public static /* synthetic */ VKRequest databaseGetMetroStations$default(DatabaseService databaseService, int i, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return databaseService.databaseGetMetroStations(i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetMetroStations$lambda-27, reason: not valid java name */
    public static final DatabaseGetMetroStationsResponse m143databaseGetMetroStations$lambda27(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetMetroStationsResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetMetroStationsResponse.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKRequest databaseGetMetroStationsById$default(DatabaseService databaseService, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return databaseService.databaseGetMetroStationsById(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetMetroStationsById$lambda-31, reason: not valid java name */
    public static final List m144databaseGetMetroStationsById$lambda31(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends DatabaseStation>>() { // from class: com.vk.sdk.api.database.DatabaseService$databaseGetMetroStationsById$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest databaseGetRegions$default(DatabaseService databaseService, int i, String str, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return databaseService.databaseGetRegions(i, str, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetRegions$lambda-34, reason: not valid java name */
    public static final DatabaseGetRegionsResponse m145databaseGetRegions$lambda34(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetRegionsResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetRegionsResponse.class);
    }

    public static /* synthetic */ VKRequest databaseGetSchoolClasses$default(DatabaseService databaseService, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return databaseService.databaseGetSchoolClasses(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetSchoolClasses$lambda-39, reason: not valid java name */
    public static final List m146databaseGetSchoolClasses$lambda39(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) GsonHolder.INSTANCE.getGson().c(it, new a<List<? extends List<? extends String>>>() { // from class: com.vk.sdk.api.database.DatabaseService$databaseGetSchoolClasses$1$typeToken$1
        }.getType());
    }

    public static /* synthetic */ VKRequest databaseGetSchools$default(DatabaseService databaseService, int i, String str, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return databaseService.databaseGetSchools(i, str, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetSchools$lambda-42, reason: not valid java name */
    public static final DatabaseGetSchoolsResponse m147databaseGetSchools$lambda42(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetSchoolsResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetSchoolsResponse.class);
    }

    public static /* synthetic */ VKRequest databaseGetUniversities$default(DatabaseService databaseService, String str, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) != 0) {
            num4 = null;
        }
        return databaseService.databaseGetUniversities(str, num, num2, num3, num4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: databaseGetUniversities$lambda-47, reason: not valid java name */
    public static final DatabaseGetUniversitiesResponse m148databaseGetUniversities$lambda47(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (DatabaseGetUniversitiesResponse) GsonHolder.INSTANCE.getGson().b(it, DatabaseGetUniversitiesResponse.class);
    }

    @NotNull
    public final VKRequest<DatabaseGetChairsResponse> databaseGetChairs(int i, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getChairs", new v0(9));
        NewApiRequest.addParam$default(newApiRequest, "faculty_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 10000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetCitiesResponse> databaseGetCities(int i, @Nullable Integer num, @Nullable String str, @Nullable Boolean bool, @Nullable Integer num2, @Nullable Integer num3) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getCities", new v0(11));
        NewApiRequest.addParam$default(newApiRequest, "country_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "region_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (bool != null) {
            newApiRequest.addParam("need_all", bool.booleanValue());
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num3.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<DatabaseCityById>> databaseGetCitiesById(@Nullable List<Integer> list) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getCitiesById", new v0(12));
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("city_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetCountriesResponse> databaseGetCountries(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getCountries", new v0(7));
        if (bool != null) {
            newApiRequest.addParam("need_all", bool.booleanValue());
        }
        if (str != null) {
            newApiRequest.addParam("code", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<BaseCountry>> databaseGetCountriesById(@Nullable List<Integer> list) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getCountriesById", new v0(6));
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("country_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetFacultiesResponse> databaseGetFaculties(int i, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getFaculties", new v0(10));
        NewApiRequest.addParam$default(newApiRequest, "university_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 10000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetMetroStationsResponse> databaseGetMetroStations(int i, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getMetroStations", new v0(14));
        NewApiRequest.addParam$default(newApiRequest, "city_id", i, 0, 0, 8, (Object) null);
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 500);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<DatabaseStation>> databaseGetMetroStationsById(@Nullable List<Integer> list) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getMetroStationsById", new v0(5));
        if (list == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("station_ids", list);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetRegionsResponse> databaseGetRegions(int i, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getRegions", new v0(3));
        NewApiRequest.addParam$default(newApiRequest, "country_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 1000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<List<List<String>>> databaseGetSchoolClasses(@Nullable Integer num) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getSchoolClasses", new v0(4));
        if (num == null) {
            return newApiRequest;
        }
        NewApiRequest.addParam$default(newApiRequest, "country_id", num.intValue(), 0, 0, 8, (Object) null);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetSchoolsResponse> databaseGetSchools(int i, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getSchools", new v0(8));
        NewApiRequest.addParam$default(newApiRequest, "city_id", i, 0, 0, 8, (Object) null);
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num2.intValue(), 0, 10000);
        return newApiRequest;
    }

    @NotNull
    public final VKRequest<DatabaseGetUniversitiesResponse> databaseGetUniversities(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        NewApiRequest newApiRequest = new NewApiRequest("database.getUniversities", new v0(13));
        if (str != null) {
            newApiRequest.addParam("q", str);
        }
        if (num != null) {
            NewApiRequest.addParam$default(newApiRequest, "country_id", num.intValue(), 0, 0, 8, (Object) null);
        }
        if (num2 != null) {
            NewApiRequest.addParam$default(newApiRequest, "city_id", num2.intValue(), 0, 0, 8, (Object) null);
        }
        if (num3 != null) {
            NewApiRequest.addParam$default(newApiRequest, "offset", num3.intValue(), 0, 0, 8, (Object) null);
        }
        if (num4 == null) {
            return newApiRequest;
        }
        newApiRequest.addParam("count", num4.intValue(), 0, 10000);
        return newApiRequest;
    }
}
