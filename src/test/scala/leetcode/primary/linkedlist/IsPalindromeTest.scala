package leetcode.primary.linkedlist

import org.scalatest.FunSuite

class IsPalindromeTest extends FunSuite {
  test("1->2") {
    check(Array(1,2), shouldBe = false)
  }

  test("1->2->2->1") {
    check(Array(1,2,2,1), shouldBe = true)
  }

  test("1") {
    check(Array(1), shouldBe = true)
  }

  test("1->2->3->2->1") {
    check(Array(1,2,3,2,1), shouldBe = true)
  }

  test("long list") {
    check(Array(12967,-2153,-23104,-9099,-28831,-1362,-19866,8761,-14174,18377,5475,-7798,14688,-16497,31892,21979,15377,-9347,-9977,-7799,-22268,598,-9964,19158,-3742,-21385,7671,-11837,24171,-19900,-14899,20012,12473,3838,14223,-2784,-9196,3639,-13195,-1867,26098,11139,-685,-4875,4412,20231,25242,30027,24637,2172,16592,-15905,-6868,-8259,11691,-900,-12506,-32767,-23633,6089,11472,30279,22764,4513,-19827,28884,13544,23452,12374,-24325,-15322,24167,-17382,-16630,-27991,15775,-29863,-14798,-1824,-13638,21064,-26744,15302,-19747,25321,26822,-15599,-12286,-6577,6442,-31191,-26923,-22815,-6902,10060,5136,-14287,-9231,2927,27270,4465,10634,-28448,-11882,-27809,29199,19631,24541,-27251,-9824,-12698,-25756,6552,10889,-25690,31160,-10352,5906,9869,23706,16156,-28612,31867,27316,-19711,14245,21118,-1494,-10133,20786,-4116,-29210,-13729,29555,-18457,14947,13354,-14569,-23360,3530,32217,24450,-7381,13714,-25747,4357,29470,1283,30658,9992,-30835,23199,4469,31730,-27637,-31480,20434,-7248,-18612,-101,25453,-12691,20890,-19840,1174,-19658,8200,1833,-11688,-5131,-30166,25842,-28975,-24260,-26717,-24787,-24261,17556,29491,-749,1648,2126,-5159,28286,-3021,-22918,-3945,-9861,-12747,-29267,9880,5189,-16132,-29359,1758,24166,19740,-27805,12019,31542,14021,-26080,7674,12906,24091,-23252,-13263,30293,-16885,10621,22224,26054,28524,-14142,29403,-7316,23768,22160,-30769,-30806,-13847,-32647,2115,-8850,-18615,-22703,-22400,20677,-12923,-598,-10196,10825,20568,-21311,12283,-32597,-5923,-10156,1310,505,8313,-24855,-1415,29347,24775,12426,-10430,23381,-12544,18981,-12301,30492,-24857,4922,26673,32285,19080,8416,19574,9024,23198,11672,-14636,25942,5889,-29277,-22867,-29092,12893,17933,-32158,23158,-19161,13203,8222,24893,-25880,-7266,-7246,9874,26236,4537,-29458,24951,16791,18703,-17574,-29327,-30113,-3219,-15231,-8839,13437,-5838,-27839,-1858,6705,-30057,-24823,-18683,-29893,-4158,-5764,30246,18069,29166,785,3162,31060,-17089,27362,-32565,27254,-3665,29597,-12372,4251,-8935,-24647,6971,5267,-10818,-30073,16843,6847,6551,10136,194,4827,-19322,17177,-11133,21980,21290,-29409,-5907,9210,13556,10760,-27852,-32091,-31521,32356,13563,-13940,11281,-4078,-21475,30164,-28749,-21347,-28989,26988,-3556,24427,6607,-18119,-18754,-19017,-22190,-22205,17454,6028,15596,-5630,12623,9582,29086,15176,27844,-7297,30050,2827,-22282,1369,-2504,-32713,-22538,31150,15045,-948,-31341,-28330,25501,5199,-2543,13471,11940,-32191,9928,14523,8789,-2815,-32000,16070,-16274,-21813,13410,-15456,19459,-10303,21911,-21580,-4172,474,-11442,32668,-3565,19586,30178,23496,29779,21237,-31999,29513,25324,24316,-24196,11222,596,-17340,-2590,30282,-2649,-6375,23528,-31730,31285,24667,8681,-11678,-13134,-2667,-29055,-30898,732,13122,22254,-16326,-22585,13689,25775,26508,25988,5844,-23789,-29877,-1164,-17065,-2075,3697,17227,-16218,-30423,26168,25922,-12796,3823,-8472,-20300,22917,10590,18245,23248,-20582,5507,30237,1299,7694,-7201,13657,1517,2648,-18471,23189,458,-16762,15574,-28032,16432,-23478,-15805,31019,9991,1283,-6305,-539,19476,-32404,-17354,2923,-14705,-6110,26120,-19272,-28597,8050,-1347,-8185,-29576,19116,31016,12498,875,-24762,-4837,5087,-11523,-22408,12726,-14277,1960,-23997,-16828,-20301,-2597,18365,4661,6734,8995,15696,1588,2297,-19622,367,27498,21760,26014,17772,9522,19103,-30832,12626,-30229,-20146,-5664,-3825,31069,24502,22667,-28376,8120,-29740,-7444,-30270,19392,21409,-10052,24265,-3676,-23290,-5067,14436,-24522,21612,-19930,29948,17230,26527,-29983,16398,-15100,-32184,17731,-28317,6698,-17872,23887,23171,22503,13940,-32535,-19197,22994,-357,22998,28989,23715,-27428,21433,-25956,-29707,16666,27004,-15800,-28655,6011,-22418,-25465,-2334,15533,-25978,20208,15183,8557,-28417,-2162,16060,8780,22764,-21705,24411,-24248,-5451,-20975,8881,16780,-18854,-12245,7043,6431,-4397,14968,-18532,-2905,13139,3674,-1852,-18960,510,26562,-3821,14201,-31325,-29719,-16694,14793,-14310,-16492,-14893,2411,-24992,15890,24939,11099,29219,-22831,31094,-25688,-23004,-17380,-8801,-23969,3111,-18205,18280,28549,20488,5726,29871,24317,-21522,-21291,-10184,5807,18558,-17930,-12762,-3173,10340,-24948,-25062,7,16566,15620,-15646,6444,8564,4874,-882,-5271,-17098,22698,-28069,-8709,12404,-2782,20914,24882,-5899,30490,-8554,21318,-20805,-29134,-14466,-16849,-32669,-29791,-5079,12852,11279,29664,24985,-18065,-10940,-31801,29651,-32166,-14253,-29209,-11301,28157,-16925,-5640,-29523,-7342,7310,-32044,11500,-28807,19233,-16437,-12630,-11354,31661,31181,-3127,6932,-7777,-389,-21973,16407,-3285,10416,-18802,-8122,-13107,9858,14688,3377,-31984,-4321,31658,30830,-28909,15286,-12300,-626,-9608,1781,-6897,-14562,-32535,17718,-24444,15777,-6830,-28406,-18713,3447,9792,-18562,-4219,-8173,-23648,-15769,-8254,4451,-24843,1691,-22160,22674,-10725,-14026,-31021,19037,8903,-23610,-19335,-24994,6867,-2211,30508,8877,11248,10688,-29896,32761,-24766,31708,14698,17624,-3099,13480,31216,16287,23409,4896,26039,-23190,-25162,11067,9724,20288,18138,-18,19596,-28085,5458,-25837,15394,13054,-4704,-25913,-23512,2555,32590,-25941,-22962,27098,-5995,17914,1480,-7905,30767,-8583,-25562,-17337,21307,18668,28458,-9898,-3375,31324,-27548,-13098,20465,-10700,15581,733,2379,22964,21412,-106,-4787,18606,21083,10637,-8152,-27425,20320,-11553,14125,12075,10499,31533,17241,15285,74,17231,-819,-7029,-15245,-12498,-11807,21220,8579,-18895,19624,-23992,-1222,30901,6973,20621,974,-5715,23942,16271,-3464,23558,-28033,-8741,-4947,1919,10668,10396,23270,-18615,-9030,19014,-22465,-11875,18185,-30381,7874,-30772,-8472,12520,2041,4542,-7898,21095,29171,-13462,11555,26943,22192,24954,16176,-19409,-24660,12617,25374,-19106,14561,23112,-2479,-3669,5661,8052,-19636,28341,13461,8779,-14213,12242,11656,-10621,15662,-6831,55,-12445,-26319,12182,15677,-636,-12511,-1891,4772,-7919,-21405,8644,15102,1237,20899,-28216,24045,-12604,-12668,-23042,-9189,18505,-182,-1574,23796,-21054,27794,-18762,28571,9358,-26099,-24990,13807,21597,19409,-13685,29774,8643,29489,24909,27232,24624,16487,12707,1862,-29629,-12312,-8240,13771,27913,-2108,-31510,-10992,31880,30768,10671,27358,2398,-16418,3923,-8,26689,-7526,14070,3953,29756,14313,7280,21273,3099,-6818,17224,-32560,2467,25456,3862,1092,-14143,29589,-32746,-6692,-3647,-14717,-11892,-29546,23866,-24082,-19577,-1221,5777,12095,-30404,-2767,-28702,-22214,-8631,-27980,2421,11716,-24994,-31839,-14955,30977,-14072,-11439,13579,5474,-10671,-23867,-26839,-7649,-17460,-4463,8113,-48,1551,17527,22520,-4896,-21555,28833,4784,-1264,-19954,-673,-24348,-31391,-1651,5039,-30745,14132,-20456,10486,28846,30672,30475,-30199,3661,-22421,-6708,-1154,-32532,-11422,-27133,423,17430,-4340,-22494,-887,5915,-6022,-17638,-31696,-3498,2070,-8706,1408,22868,32541,29042,-1625,-6378,4106,15880,-4854,-12765,-28450,19774,9398,-6064,-11870,-17681,20217,-30577,-90,28595,-12753,-29939,2155,-16740,18853,-10169,9274,-21724,4533,-6735,-31434,20607,3572,19062,23543,4108,-29261,-4412,-5460,5871,17194,-29195,7166,-6095,18621,-2096,7889,6640,17153,-10821,-18114,19447,12224,-23214,18778,29796,16172,-31244,-29663,12050,-17018,-18329,-26215,2344,-7641,19535,-5276,-49,22503,-25894,19075,-13161,29365,26767,-10739,3809,-29472,-24265,-7817,14589,867,-2901,18858,5498,-10412,-2880,11963,12038,23851,3067,-1175,-32729,2246,21491,995,30038,25578,31562,12213,-17785,21573,-30278,-8936,-12966,-20554,-19932,23663,4301,22282,-18927,18814,2768,13977,3955,23934,9709,28273,17787,-18094,-4683,4336,-28090,1055,-15349,1905,27182,-15531,-11287,1391,7364,-12870,-9487,23657,-19155,28424,30796,31322,26151,-16620,9193,28481,17687,-10945,22123,1225,-27711,22820,17765,-8642,26308,32113,6909,21038,-13972,-31231,22866,-26874,28271,-3047,31907,-17184,-17406,12209,32185,19839,-11282,-27289,-21161,2087,-14733,19798,29758,14454,27115,-6231,14434,18378,16056,2293,10663,18464,-7473,14355,-28043,-7217,25320,-21169,26302,11129,13438,30942,-18316,-28709,-16109,-15547,-11947,-28059,-30684,-17232,-15358,24529,5137,23827,19512,-184,8571,-19037,-596,-16765,-2336,-22567,-22652,-5514,24035,-25544,-1886,8430,14117,-10895,-24489,31618,-32133,2858,31879,22847,16168,19748,-17017,-24125,4666,24832,-9147,22351,21644,-27343,14128,-15258,23254,-28006,-7347,32396,613,5822,21946,-19627,29811,-2330,15625,16931,3260,8819,2408,10495,26013,-25471,18585,-19586,28977,-4324,24219,-29252,-20007,10129,-3465,-25944,-1740,-21567,-25336,10514,-9373,-18692,-15600,20256,15389,-31898,-15627,23374,-4865,32748,-15305,17642,16338,30913,28194,22968,-20110,9762,-28220,7718,25256,-20010,-16297,13866,11956,19176,8668,-14318,25642,-4314,12708,-5638,-4758,-22916,4990,6535,-9949,32411,27760,-24875,5814,-30520,5787,26369,-22290,-6365,-13574,15923,13532,-11874,-15641,-521,18507,-12549,5643,-24116,-2263,25008,8851,2718,-13909,2918,14465,21372,9139,9508,-30359,20281,-12458,-15044,9934,13605,20677,21461,20447,30135,4644,21933,-32715,30766,4486,26412,-395,13754,31704,21153,-7694,23348,10604,-31580,8246,-9142,-4199,-26134,-18030,-2695,11893,17409,16740,24485,26091,-30161,-20310,22049,22563,-26403,-2855,15511,16450,21317,-9575,-31954,9012,-8297,-19924,-11000,-18246,-25753,-3189,4985,-24982,-9087,-20363,-24720,18406,-26827,-13692,-21876,15407,9135,-10848,17522,-24220,-16572,16167,-24365,-3152,-6085,-15736,-31688,21828,-28271,3188,-4015,-15113,-4451,28797,18921,4059,-76,-3914,-1272,-20980,5154,-1159,-13541,31514,9004,-12412,31943,14278,31772,6657,18004,28998,-31889,-9757,4881,-8155,1442,-24526,13273,-14604,-3354,-8516,22167,-7456,-28094,5650,13253,-15413,-20588,-19727,-21344,-18459,-4334,-24409,-4334,-18459,-21344,-19727,-20588,-15413,13253,5650,-28094,-7456,22167,-8516,-3354,-14604,13273,-24526,1442,-8155,4881,-9757,-31889,28998,18004,6657,31772,14278,31943,-12412,9004,31514,-13541,-1159,5154,-20980,-1272,-3914,-76,4059,18921,28797,-4451,-15113,-4015,3188,-28271,21828,-31688,-15736,-6085,-3152,-24365,16167,-16572,-24220,17522,-10848,9135,15407,-21876,-13692,-26827,18406,-24720,-20363,-9087,-24982,4985,-3189,-25753,-18246,-11000,-19924,-8297,9012,-31954,-9575,21317,16450,15511,-2855,-26403,22563,22049,-20310,-30161,26091,24485,16740,17409,11893,-2695,-18030,-26134,-4199,-9142,8246,-31580,10604,23348,-7694,21153,31704,13754,-395,26412,4486,30766,-32715,21933,4644,30135,20447,21461,20677,13605,9934,-15044,-12458,20281,-30359,9508,9139,21372,14465,2918,-13909,2718,8851,25008,-2263,-24116,5643,-12549,18507,-521,-15641,-11874,13532,15923,-13574,-6365,-22290,26369,5787,-30520,5814,-24875,27760,32411,-9949,6535,4990,-22916,-4758,-5638,12708,-4314,25642,-14318,8668,19176,11956,13866,-16297,-20010,25256,7718,-28220,9762,-20110,22968,28194,30913,16338,17642,-15305,32748,-4865,23374,-15627,-31898,15389,20256,-15600,-18692,-9373,10514,-25336,-21567,-1740,-25944,-3465,10129,-20007,-29252,24219,-4324,28977,-19586,18585,-25471,26013,10495,2408,8819,3260,16931,15625,-2330,29811,-19627,21946,5822,613,32396,-7347,-28006,23254,-15258,14128,-27343,21644,22351,-9147,24832,4666,-24125,-17017,19748,16168,22847,31879,2858,-32133,31618,-24489,-10895,14117,8430,-1886,-25544,24035,-5514,-22652,-22567,-2336,-16765,-596,-19037,8571,-184,19512,23827,5137,24529,-15358,-17232,-30684,-28059,-11947,-15547,-16109,-28709,-18316,30942,13438,11129,26302,-21169,25320,-7217,-28043,14355,-7473,18464,10663,2293,16056,18378,14434,-6231,27115,14454,29758,19798,-14733,2087,-21161,-27289,-11282,19839,32185,12209,-17406,-17184,31907,-3047,28271,-26874,22866,-31231,-13972,21038,6909,32113,26308,-8642,17765,22820,-27711,1225,22123,-10945,17687,28481,9193,-16620,26151,31322,30796,28424,-19155,23657,-9487,-12870,7364,1391,-11287,-15531,27182,1905,-15349,1055,-28090,4336,-4683,-18094,17787,28273,9709,23934,3955,13977,2768,18814,-18927,22282,4301,23663,-19932,-20554,-12966,-8936,-30278,21573,-17785,12213,31562,25578,30038,995,21491,2246,-32729,-1175,3067,23851,12038,11963,-2880,-10412,5498,18858,-2901,867,14589,-7817,-24265,-29472,3809,-10739,26767,29365,-13161,19075,-25894,22503,-49,-5276,19535,-7641,2344,-26215,-18329,-17018,12050,-29663,-31244,16172,29796,18778,-23214,12224,19447,-18114,-10821,17153,6640,7889,-2096,18621,-6095,7166,-29195,17194,5871,-5460,-4412,-29261,4108,23543,19062,3572,20607,-31434,-6735,4533,-21724,9274,-10169,18853,-16740,2155,-29939,-12753,28595,-90,-30577,20217,-17681,-11870,-6064,9398,19774,-28450,-12765,-4854,15880,4106,-6378,-1625,29042,32541,22868,1408,-8706,2070,-3498,-31696,-17638,-6022,5915,-887,-22494,-4340,17430,423,-27133,-11422,-32532,-1154,-6708,-22421,3661,-30199,30475,30672,28846,10486,-20456,14132,-30745,5039,-1651,-31391,-24348,-673,-19954,-1264,4784,28833,-21555,-4896,22520,17527,1551,-48,8113,-4463,-17460,-7649,-26839,-23867,-10671,5474,13579,-11439,-14072,30977,-14955,-31839,-24994,11716,2421,-27980,-8631,-22214,-28702,-2767,-30404,12095,5777,-1221,-19577,-24082,23866,-29546,-11892,-14717,-3647,-6692,-32746,29589,-14143,1092,3862,25456,2467,-32560,17224,-6818,3099,21273,7280,14313,29756,3953,14070,-7526,26689,-8,3923,-16418,2398,27358,10671,30768,31880,-10992,-31510,-2108,27913,13771,-8240,-12312,-29629,1862,12707,16487,24624,27232,24909,29489,8643,29774,-13685,19409,21597,13807,-24990,-26099,9358,28571,-18762,27794,-21054,23796,-1574,-182,18505,-9189,-23042,-12668,-12604,24045,-28216,20899,1237,15102,8644,-21405,-7919,4772,-1891,-12511,-636,15677,12182,-26319,-12445,55,-6831,15662,-10621,11656,12242,-14213,8779,13461,28341,-19636,8052,5661,-3669,-2479,23112,14561,-19106,25374,12617,-24660,-19409,16176,24954,22192,26943,11555,-13462,29171,21095,-7898,4542,2041,12520,-8472,-30772,7874,-30381,18185,-11875,-22465,19014,-9030,-18615,23270,10396,10668,1919,-4947,-8741,-28033,23558,-3464,16271,23942,-5715,974,20621,6973,30901,-1222,-23992,19624,-18895,8579,21220,-11807,-12498,-15245,-7029,-819,17231,74,15285,17241,31533,10499,12075,14125,-11553,20320,-27425,-8152,10637,21083,18606,-4787,-106,21412,22964,2379,733,15581,-10700,20465,-13098,-27548,31324,-3375,-9898,28458,18668,21307,-17337,-25562,-8583,30767,-7905,1480,17914,-5995,27098,-22962,-25941,32590,2555,-23512,-25913,-4704,13054,15394,-25837,5458,-28085,19596,-18,18138,20288,9724,11067,-25162,-23190,26039,4896,23409,16287,31216,13480,-3099,17624,14698,31708,-24766,32761,-29896,10688,11248,8877,30508,-2211,6867,-24994,-19335,-23610,8903,19037,-31021,-14026,-10725,22674,-22160,1691,-24843,4451,-8254,-15769,-23648,-8173,-4219,-18562,9792,3447,-18713,-28406,-6830,15777,-24444,17718,-32535,-14562,-6897,1781,-9608,-626,-12300,15286,-28909,30830,31658,-4321,-31984,3377,14688,9858,-13107,-8122,-18802,10416,-3285,16407,-21973,-389,-7777,6932,-3127,31181,31661,-11354,-12630,-16437,19233,-28807,11500,-32044,7310,-7342,-29523,-5640,-16925,28157,-11301,-29209,-14253,-32166,29651,-31801,-10940,-18065,24985,29664,11279,12852,-5079,-29791,-32669,-16849,-14466,-29134,-20805,21318,-8554,30490,-5899,24882,20914,-2782,12404,-8709,-28069,22698,-17098,-5271,-882,4874,8564,6444,-15646,15620,16566,7,-25062,-24948,10340,-3173,-12762,-17930,18558,5807,-10184,-21291,-21522,24317,29871,5726,20488,28549,18280,-18205,3111,-23969,-8801,-17380,-23004,-25688,31094,-22831,29219,11099,24939,15890,-24992,2411,-14893,-16492,-14310,14793,-16694,-29719,-31325,14201,-3821,26562,510,-18960,-1852,3674,13139,-2905,-18532,14968,-4397,6431,7043,-12245,-18854,16780,8881,-20975,-5451,-24248,24411,-21705,22764,8780,16060,-2162,-28417,8557,15183,20208,-25978,15533,-2334,-25465,-22418,6011,-28655,-15800,27004,16666,-29707,-25956,21433,-27428,23715,28989,22998,-357,22994,-19197,-32535,13940,22503,23171,23887,-17872,6698,-28317,17731,-32184,-15100,16398,-29983,26527,17230,29948,-19930,21612,-24522,14436,-5067,-23290,-3676,24265,-10052,21409,19392,-30270,-7444,-29740,8120,-28376,22667,24502,31069,-3825,-5664,-20146,-30229,12626,-30832,19103,9522,17772,26014,21760,27498,367,-19622,2297,1588,15696,8995,6734,4661,18365,-2597,-20301,-16828,-23997,1960,-14277,12726,-22408,-11523,5087,-4837,-24762,875,12498,31016,19116,-29576,-8185,-1347,8050,-28597,-19272,26120,-6110,-14705,2923,-17354,-32404,19476,-539,-6305,1283,9991,31019,-15805,-23478,16432,-28032,15574,-16762,458,23189,-18471,2648,1517,13657,-7201,7694,1299,30237,5507,-20582,23248,18245,10590,22917,-20300,-8472,3823,-12796,25922,26168,-30423,-16218,17227,3697,-2075,-17065,-1164,-29877,-23789,5844,25988,26508,25775,13689,-22585,-16326,22254,13122,732,-30898,-29055,-2667,-13134,-11678,8681,24667,31285,-31730,23528,-6375,-2649,30282,-2590,-17340,596,11222,-24196,24316,25324,29513,-31999,21237,29779,23496,30178,19586,-3565,32668,-11442,474,-4172,-21580,21911,-10303,19459,-15456,13410,-21813,-16274,16070,-32000,-2815,8789,14523,9928,-32191,11940,13471,-2543,5199,25501,-28330,-31341,-948,15045,31150,-22538,-32713,-2504,1369,-22282,2827,30050,-7297,27844,15176,29086,9582,12623,-5630,15596,6028,17454,-22205,-22190,-19017,-18754,-18119,6607,24427,-3556,26988,-28989,-21347,-28749,30164,-21475,-4078,11281,-13940,13563,32356,-31521,-32091,-27852,10760,13556,9210,-5907,-29409,21290,21980,-11133,17177,-19322,4827,194,10136,6551,6847,16843,-30073,-10818,5267,6971,-24647,-8935,4251,-12372,29597,-3665,27254,-32565,27362,-17089,31060,3162,785,29166,18069,30246,-5764,-4158,-29893,-18683,-24823,-30057,6705,-1858,-27839,-5838,13437,-8839,-15231,-3219,-30113,-29327,-17574,18703,16791,24951,-29458,4537,26236,9874,-7246,-7266,-25880,24893,8222,13203,-19161,23158,-32158,17933,12893,-29092,-22867,-29277,5889,25942,-14636,11672,23198,9024,19574,8416,19080,32285,26673,4922,-24857,30492,-12301,18981,-12544,23381,-10430,12426,24775,29347,-1415,-24855,8313,505,1310,-10156,-5923,-32597,12283,-21311,20568,10825,-10196,-598,-12923,20677,-22400,-22703,-18615,-8850,2115,-32647,-13847,-30806,-30769,22160,23768,-7316,29403,-14142,28524,26054,22224,10621,-16885,30293,-13263,-23252,24091,12906,7674,-26080,14021,31542,12019,-27805,19740,24166,1758,-29359,-16132,5189,9880,-29267,-12747,-9861,-3945,-22918,-3021,28286,-5159,2126,1648,-749,29491,17556,-24261,-24787,-26717,-24260,-28975,25842,-30166,-5131,-11688,1833,8200,-19658,1174,-19840,20890,-12691,25453,-101,-18612,-7248,20434,-31480,-27637,31730,4469,23199,-30835,9992,30658,1283,29470,4357,-25747,13714,-7381,24450,32217,3530,-23360,-14569,13354,14947,-18457,29555,-13729,-29210,-4116,20786,-10133,-1494,21118,14245,-19711,27316,31867,-28612,16156,23706,9869,5906,-10352,31160,-25690,10889,6552,-25756,-12698,-9824,-27251,24541,19631,29199,-27809,-11882,-28448,10634,4465,27270,2927,-9231,-14287,5136,10060,-6902,-22815,-26923,-31191,6442,-6577,-12286,-15599,26822,25321,-19747,15302,-26744,21064,-13638,-1824,-14798,-29863,15775,-27991,-16630,-17382,24167,-15322,-24325,12374,23452,13544,28884,-19827,4513,22764,30279,11472,6089,-23633,-32767,-12506,-900,11691,-8259,-6868,-15905,16592,2172,24637,30027,25242,20231,4412,-4875,-685,11139,26098,-1867,-13195,3639,-9196,-2784,14223,3838,12473,20012,-14899,-19900,24171,-11837,7671,-21385,-3742,19158,-9964,598,-22268,-7799,-9977,-9347,15377,21979,31892,-16497,14688,-7798,5475,18377,-14174,8761,-19866,-1362,-28831,-9099,-23104,-2153,12967),shouldBe = true)
  }

  private def check(arr1: Array[Int], shouldBe: Boolean): Unit = {
    val len1 = arr1.length
    val list1 = ListNode.makeLinkedList(arr1, len1)
    val result = IsPalindrome.isPalindrome(list1)
    assert(result == shouldBe)
  }
}