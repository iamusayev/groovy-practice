/**
 *
 * " "
 * ' '
 * """ """
 * ''' '''
 * /   /
 * $/  /$
 *
 */

def name = "John"
char value = 'H'

def stringValue = "Hello $name"
println(stringValue)

def value2 = """
SELECT *
FROM
table where name = ${getWithPrefix(name)}
"""

value3 = '''
SELECT *
FROM
table where name = $name
'''

println value3

def value5 = /Hello word $name/
println value5

def value6 = $/Hello word $name/$
println value6

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Jo'
println name - 'hn'


def getWithPrefix(String name) {
    "prefix-" + name
}