package canoe.models

import io.circe.{Decoder, Encoder}

import scala.language.implicitConversions

/**
  * ISO 3166-1 alpha-2 country codes.
  */
object CountryCode extends Enumeration {
  type CountryCode = Value
  final class Country private[CountryCode] (val code: String, val englishName: String) extends Val(code)

  implicit def valueToCountry(v: Value): Country = v.asInstanceOf[Country]

  implicit val countryCodeEncoder: Encoder[CountryCode] =
    Encoder[String].contramap(_.toString)

  implicit val countryCodeDecoder: Decoder[CountryCode] =
    Decoder[String].map(a => CountryCode.withName(a))

  val AD = new Country(code = "AD", englishName = "Andorra")
  val AE = new Country(code = "AE", englishName = "United Arab Emirates")
  val AF = new Country(code = "AF", englishName = "Afghanistan")
  val AG = new Country(code = "AG", englishName = "Antigua and Barbuda")
  val AI = new Country(code = "AI", englishName = "Anguilla")
  val AL = new Country(code = "AL", englishName = "Albania")
  val AM = new Country(code = "AM", englishName = "Armenia")
  val AN = new Country(code = "AN", englishName = "Netherlands Antilles")
  val AO = new Country(code = "AO", englishName = "Angola")
  val AQ = new Country(code = "AQ", englishName = "Antarctica")
  val AR = new Country(code = "AR", englishName = "Argentina")
  val AS = new Country(code = "AS", englishName = "American Samoa")
  val AT = new Country(code = "AT", englishName = "Austria")
  val AU = new Country(code = "AU", englishName = "Australia")
  val AW = new Country(code = "AW", englishName = "Aruba")
  val AX = new Country(code = "AX", englishName = "Åland Islands")
  val AZ = new Country(code = "AZ", englishName = "Azerbaijan")
  val BA = new Country(code = "BA", englishName = "Bosnia and Herzegovina")
  val BB = new Country(code = "BB", englishName = "Barbados")
  val BD = new Country(code = "BD", englishName = "Bangladesh")
  val BE = new Country(code = "BE", englishName = "Belgium")
  val BF = new Country(code = "BF", englishName = "Burkina Faso")
  val BG = new Country(code = "BG", englishName = "Bulgaria")
  val BH = new Country(code = "BH", englishName = "Bahrain")
  val BI = new Country(code = "BI", englishName = "Burundi")
  val BJ = new Country(code = "BJ", englishName = "Benin")
  val BL = new Country(code = "BL", englishName = "Saint Barthélemy")
  val BM = new Country(code = "BM", englishName = "Bermuda")
  val BN = new Country(code = "BN", englishName = "Brunei")
  val BO = new Country(code = "BO", englishName = "Bolivia")
  val BQ = new Country(code = "BQ", englishName = "Bonaire, Sint Eustatius and Saba")
  val BR = new Country(code = "BR", englishName = "Brazil")
  val BS = new Country(code = "BS", englishName = "Bahamas")
  val BT = new Country(code = "BT", englishName = "Bhutan")
  val BV = new Country(code = "BV", englishName = "Bouvet Island")
  val BW = new Country(code = "BW", englishName = "Botswana")
  val BY = new Country(code = "BY", englishName = "Belarus")
  val BZ = new Country(code = "BZ", englishName = "Belize")
  val CA = new Country(code = "CA", englishName = "Canada")
  val CC = new Country(code = "CC", englishName = "Cocos Islands")
  val CD = new Country(code = "CD", englishName = "The Democratic Republic Of Congo")
  val CF = new Country(code = "CF", englishName = "Central African Republic")
  val CG = new Country(code = "CG", englishName = "Congo")
  val CH = new Country(code = "CH", englishName = "Switzerland")
  val CI = new Country(code = "CI", englishName = "Côte d'Ivoire")
  val CK = new Country(code = "CK", englishName = "Cook Islands")
  val CL = new Country(code = "CL", englishName = "Chile")
  val CM = new Country(code = "CM", englishName = "Cameroon")
  val CN = new Country(code = "CN", englishName = "China")
  val CO = new Country(code = "CO", englishName = "Colombia")
  val CR = new Country(code = "CR", englishName = "Costa Rica")
  val CU = new Country(code = "CU", englishName = "Cuba")
  val CV = new Country(code = "CV", englishName = "Cape Verde")
  val CW = new Country(code = "CW", englishName = "Curaçao")
  val CX = new Country(code = "CX", englishName = "Christmas Island")
  val CY = new Country(code = "CY", englishName = "Cyprus")
  val CZ = new Country(code = "CZ", englishName = "Czech Republic")
  val DE = new Country(code = "DE", englishName = "Germany")
  val DJ = new Country(code = "DJ", englishName = "Djibouti")
  val DK = new Country(code = "DK", englishName = "Denmark")
  val DM = new Country(code = "DM", englishName = "Dominica")
  val DO = new Country(code = "DO", englishName = "Dominican Republic")
  val DZ = new Country(code = "DZ", englishName = "Algeria")
  val EC = new Country(code = "EC", englishName = "Ecuador")
  val EE = new Country(code = "EE", englishName = "Estonia")
  val EG = new Country(code = "EG", englishName = "Egypt")
  val EH = new Country(code = "EH", englishName = "Western Sahara")
  val ER = new Country(code = "ER", englishName = "Eritrea")
  val ES = new Country(code = "ES", englishName = "Spain")
  val ET = new Country(code = "ET", englishName = "Ethiopia")
  val FI = new Country(code = "FI", englishName = "Finland")
  val FJ = new Country(code = "FJ", englishName = "Fiji")
  val FK = new Country(code = "FK", englishName = "Falkland Islands")
  val FM = new Country(code = "FM", englishName = "Micronesia")
  val FO = new Country(code = "FO", englishName = "Faroe Islands")
  val FR = new Country(code = "FR", englishName = "France")
  val GA = new Country(code = "GA", englishName = "Gabon")
  val GB = new Country(code = "GB", englishName = "United Kingdom")
  val GD = new Country(code = "GD", englishName = "Grenada")
  val GE = new Country(code = "GE", englishName = "Georgia")
  val GF = new Country(code = "GF", englishName = "French Guiana")
  val GG = new Country(code = "GG", englishName = "Guernsey")
  val GH = new Country(code = "GH", englishName = "Ghana")
  val GI = new Country(code = "GI", englishName = "Gibraltar")
  val GL = new Country(code = "GL", englishName = "Greenland")
  val GM = new Country(code = "GM", englishName = "Gambia")
  val GN = new Country(code = "GN", englishName = "Guinea")
  val GP = new Country(code = "GP", englishName = "Guadeloupe")
  val GQ = new Country(code = "GQ", englishName = "Equatorial Guinea")
  val GR = new Country(code = "GR", englishName = "Greece")
  val GS = new Country(code = "GS", englishName = "South Georgia And The South Sandwich Islands")
  val GT = new Country(code = "GT", englishName = "Guatemala")
  val GU = new Country(code = "GU", englishName = "Guam")
  val GW = new Country(code = "GW", englishName = "Guinea-Bissau")
  val GY = new Country(code = "GY", englishName = "Guyana")
  val HK = new Country(code = "HK", englishName = "Hong Kong")
  val HM = new Country(code = "HM", englishName = "Heard Island And McDonald Islands")
  val HN = new Country(code = "HN", englishName = "Honduras")
  val HR = new Country(code = "HR", englishName = "Croatia")
  val HT = new Country(code = "HT", englishName = "Haiti")
  val HU = new Country(code = "HU", englishName = "Hungary")
  val ID = new Country(code = "ID", englishName = "Indonesia")
  val IE = new Country(code = "IE", englishName = "Ireland")
  val IL = new Country(code = "IL", englishName = "Israel")
  val IM = new Country(code = "IM", englishName = "Isle Of Man")
  val IN = new Country(code = "IN", englishName = "India")
  val IO = new Country(code = "IO", englishName = "British Indian Ocean Territory")
  val IQ = new Country(code = "IQ", englishName = "Iraq")
  val IR = new Country(code = "IR", englishName = "Iran")
  val IS = new Country(code = "IS", englishName = "Iceland")
  val IT = new Country(code = "IT", englishName = "Italy")
  val JE = new Country(code = "JE", englishName = "Jersey")
  val JM = new Country(code = "JM", englishName = "Jamaica")
  val JO = new Country(code = "JO", englishName = "Jordan")
  val JP = new Country(code = "JP", englishName = "Japan")
  val KE = new Country(code = "KE", englishName = "Kenya")
  val KG = new Country(code = "KG", englishName = "Kyrgyzstan")
  val KH = new Country(code = "KH", englishName = "Cambodia")
  val KI = new Country(code = "KI", englishName = "Kiribati")
  val KM = new Country(code = "KM", englishName = "Comoros")
  val KN = new Country(code = "KN", englishName = "Saint Kitts And Nevis")
  val KP = new Country(code = "KP", englishName = "North Korea")
  val KR = new Country(code = "KR", englishName = "South Korea")
  val KW = new Country(code = "KW", englishName = "Kuwait")
  val KY = new Country(code = "KY", englishName = "Cayman Islands")
  val KZ = new Country(code = "KZ", englishName = "Kazakhstan")
  val LA = new Country(code = "LA", englishName = "Laos")
  val LB = new Country(code = "LB", englishName = "Lebanon")
  val LC = new Country(code = "LC", englishName = "Saint Lucia")
  val LI = new Country(code = "LI", englishName = "Liechtenstein")
  val LK = new Country(code = "LK", englishName = "Sri Lanka")
  val LR = new Country(code = "LR", englishName = "Liberia")
  val LS = new Country(code = "LS", englishName = "Lesotho")
  val LT = new Country(code = "LT", englishName = "Lithuania")
  val LU = new Country(code = "LU", englishName = "Luxembourg")
  val LV = new Country(code = "LV", englishName = "Latvia")
  val LY = new Country(code = "LY", englishName = "Libya")
  val MA = new Country(code = "MA", englishName = "Morocco")
  val MC = new Country(code = "MC", englishName = "Monaco")
  val MD = new Country(code = "MD", englishName = "Moldova")
  val ME = new Country(code = "ME", englishName = "Montenegro")
  val MF = new Country(code = "MF", englishName = "Saint Martin")
  val MG = new Country(code = "MG", englishName = "Madagascar")
  val MH = new Country(code = "MH", englishName = "Marshall Islands")
  val MK = new Country(code = "MK", englishName = "Macedonia")
  val ML = new Country(code = "ML", englishName = "Mali")
  val MM = new Country(code = "MM", englishName = "Myanmar")
  val MN = new Country(code = "MN", englishName = "Mongolia")
  val MO = new Country(code = "MO", englishName = "Macao")
  val MP = new Country(code = "MP", englishName = "Northern Mariana Islands")
  val MQ = new Country(code = "MQ", englishName = "Martinique")
  val MR = new Country(code = "MR", englishName = "Mauritania")
  val MS = new Country(code = "MS", englishName = "Montserrat")
  val MT = new Country(code = "MT", englishName = "Malta")
  val MU = new Country(code = "MU", englishName = "Mauritius")
  val MV = new Country(code = "MV", englishName = "Maldives")
  val MW = new Country(code = "MW", englishName = "Malawi")
  val MX = new Country(code = "MX", englishName = "Mexico")
  val MY = new Country(code = "MY", englishName = "Malaysia")
  val MZ = new Country(code = "MZ", englishName = "Mozambique")
  val NA = new Country(code = "NA", englishName = "Namibia")
  val NC = new Country(code = "NC", englishName = "New Caledonia")
  val NE = new Country(code = "NE", englishName = "Niger")
  val NF = new Country(code = "NF", englishName = "Norfolk Island")
  val NG = new Country(code = "NG", englishName = "Nigeria")
  val NI = new Country(code = "NI", englishName = "Nicaragua")
  val NL = new Country(code = "NL", englishName = "Netherlands")
  val NO = new Country(code = "NO", englishName = "Norway")
  val NP = new Country(code = "NP", englishName = "Nepal")
  val NR = new Country(code = "NR", englishName = "Nauru")
  val NU = new Country(code = "NU", englishName = "Niue")
  val NZ = new Country(code = "NZ", englishName = "New Zealand")
  val OM = new Country(code = "OM", englishName = "Oman")
  val PA = new Country(code = "PA", englishName = "Panama")
  val PE = new Country(code = "PE", englishName = "Peru")
  val PF = new Country(code = "PF", englishName = "French Polynesia")
  val PG = new Country(code = "PG", englishName = "Papua New Guinea")
  val PH = new Country(code = "PH", englishName = "Philippines")
  val PK = new Country(code = "PK", englishName = "Pakistan")
  val PL = new Country(code = "PL", englishName = "Poland")
  val PM = new Country(code = "PM", englishName = "Saint Pierre And Miquelon")
  val PN = new Country(code = "PN", englishName = "Pitcairn")
  val PR = new Country(code = "PR", englishName = "Puerto Rico")
  val PS = new Country(code = "PS", englishName = "Palestine")
  val PT = new Country(code = "PT", englishName = "Portugal")
  val PW = new Country(code = "PW", englishName = "Palau")
  val PY = new Country(code = "PY", englishName = "Paraguay")
  val QA = new Country(code = "QA", englishName = "Qatar")
  val RE = new Country(code = "RE", englishName = "Reunion")
  val RO = new Country(code = "RO", englishName = "Romania")
  val RS = new Country(code = "RS", englishName = "Serbia")
  val RU = new Country(code = "RU", englishName = "Russia")
  val RW = new Country(code = "RW", englishName = "Rwanda")
  val SA = new Country(code = "SA", englishName = "Saudi Arabia")
  val SB = new Country(code = "SB", englishName = "Solomon Islands")
  val SC = new Country(code = "SC", englishName = "Seychelles")
  val SD = new Country(code = "SD", englishName = "Sudan")
  val SE = new Country(code = "SE", englishName = "Sweden")
  val SG = new Country(code = "SG", englishName = "Singapore")
  val SH = new Country(code = "SH", englishName = "Saint Helena")
  val SI = new Country(code = "SI", englishName = "Slovenia")
  val SJ = new Country(code = "SJ", englishName = "Svalbard And Jan Mayen")
  val SK = new Country(code = "SK", englishName = "Slovakia")
  val SL = new Country(code = "SL", englishName = "Sierra Leone")
  val SM = new Country(code = "SM", englishName = "San Marino")
  val SN = new Country(code = "SN", englishName = "Senegal")
  val SO = new Country(code = "SO", englishName = "Somalia")
  val SR = new Country(code = "SR", englishName = "Suriname")
  val SS = new Country(code = "SS", englishName = "South Sudan")
  val ST = new Country(code = "ST", englishName = "Sao Tome And Principe")
  val SV = new Country(code = "SV", englishName = "El Salvador")
  val SX = new Country(code = "SX", englishName = "Sint Maarten (Dutch part)")
  val SY = new Country(code = "SY", englishName = "Syria")
  val SZ = new Country(code = "SZ", englishName = "Swaziland")
  val TC = new Country(code = "TC", englishName = "Turks And Caicos Islands")
  val TD = new Country(code = "TD", englishName = "Chad")
  val TF = new Country(code = "TF", englishName = "French Southern Territories")
  val TG = new Country(code = "TG", englishName = "Togo")
  val TH = new Country(code = "TH", englishName = "Thailand")
  val TJ = new Country(code = "TJ", englishName = "Tajikistan")
  val TK = new Country(code = "TK", englishName = "Tokelau")
  val TL = new Country(code = "TL", englishName = "Timor-Leste")
  val TM = new Country(code = "TM", englishName = "Turkmenistan")
  val TN = new Country(code = "TN", englishName = "Tunisia")
  val TO = new Country(code = "TO", englishName = "Tonga")
  val TR = new Country(code = "TR", englishName = "Turkey")
  val TT = new Country(code = "TT", englishName = "Trinidad and Tobago")
  val TV = new Country(code = "TV", englishName = "Tuvalu")
  val TW = new Country(code = "TW", englishName = "Taiwan")
  val TZ = new Country(code = "TZ", englishName = "Tanzania")
  val UA = new Country(code = "UA", englishName = "Ukraine")
  val UG = new Country(code = "UG", englishName = "Uganda")
  val UM = new Country(code = "UM", englishName = "United States Minor Outlying Islands")
  val US = new Country(code = "US", englishName = "United States")
  val UY = new Country(code = "UY", englishName = "Uruguay")
  val UZ = new Country(code = "UZ", englishName = "Uzbekistan")
  val VA = new Country(code = "VA", englishName = "Vatican")
  val VC = new Country(code = "VC", englishName = "Saint Vincent And The Grenadines")
  val VE = new Country(code = "VE", englishName = "Venezuela")
  val VG = new Country(code = "VG", englishName = "British Virgin Islands")
  val VI = new Country(code = "VI", englishName = "U.S. Virgin Islands")
  val VN = new Country(code = "VN", englishName = "Vietnam")
  val VU = new Country(code = "VU", englishName = "Vanuatu")
  val WF = new Country(code = "WF", englishName = "Wallis And Futuna")
  val WS = new Country(code = "WS", englishName = "Samoa")
  val YE = new Country(code = "YE", englishName = "Yemen")
  val YT = new Country(code = "YT", englishName = "Mayotte")
  val ZA = new Country(code = "ZA", englishName = "South Africa")
  val ZM = new Country(code = "ZM", englishName = "Zambia")
  val ZW = new Country(code = "ZW", englishName = "Zimbabwe")
}
